package cz.zcu.kiv.antlr.impl;

import cz.zcu.kiv.gen.SimpleBaseListener;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.datatype.DataType;
import cz.zcu.kiv.simple.lang.datatype.impl.Void;
import cz.zcu.kiv.simple.lang.impl.FunctionImpl;
import cz.zcu.kiv.utils.AnalysisException;
import cz.zcu.kiv.utils.IFactory;
import cz.zcu.kiv.utils.pl0.PL0Operation;
import cz.zcu.kiv.utils.pl0.PL0OutputStreamWriter;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static cz.zcu.kiv.utils.ContextUtils.getArrayTypeParameterSize;
import static cz.zcu.kiv.utils.ContextUtils.getParameterIdentifier;
import static cz.zcu.kiv.utils.ContextUtils.hasFunctionParams;
import static cz.zcu.kiv.utils.ContextUtils.isArrayAccess;
import static cz.zcu.kiv.utils.ContextUtils.isBooleanLiteral;
import static cz.zcu.kiv.utils.ContextUtils.isIdentifierReference;
import static cz.zcu.kiv.utils.ContextUtils.isIfStatement;
import static cz.zcu.kiv.utils.ContextUtils.isParameterArrayType;
import static cz.zcu.kiv.utils.ContextUtils.isSignedConstant;
import static cz.zcu.kiv.utils.ContextUtils.isTernaryOperator;
import static cz.zcu.kiv.utils.DataTypeUtils.getConditionalExpressionReturnValueType;
import static cz.zcu.kiv.utils.DataTypeUtils.getExpressionReturnValueType;
import static cz.zcu.kiv.utils.DataTypeUtils.getMainFunctionReturnType;
import static cz.zcu.kiv.utils.DataTypeUtils.getReturnTypeFromContext;
import static cz.zcu.kiv.utils.DataTypeUtils.isInteger;
import static cz.zcu.kiv.utils.EvaluationUtils.evaluateBooleanLiteral;
import static cz.zcu.kiv.utils.EvaluationUtils.evaluateConditionalExpressionAssignment;
import static cz.zcu.kiv.utils.EvaluationUtils.evaluateConditionalExpressionDeclaration;
import static cz.zcu.kiv.utils.EvaluationUtils.evaluateSignedConstant;
import static cz.zcu.kiv.utils.EvaluationUtils.initializeArray;
import static cz.zcu.kiv.utils.EvaluationUtils.saveValueToVariable;
import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class SimpleListenerImpl extends SimpleBaseListener {

    private static final String MAIN_FUNCTION_NAME = "main";
    public static final int DEFAULT_STACK_INCREMENT_AMOUNT = 3;

    private final Map<String, Symbol<Function>> globalSymbolTable = new HashMap<>();
    private Function currentScope;
    private final PL0OutputStreamWriter writer;
    private final IFactory factory;

    private boolean inIfStatementBlock = false;
    private int ifJmcInstructionAddress = 0;
    private boolean inElseStatementBlock = false;
    private int ifEndJmpInstructionAddress = 0;

    public SimpleListenerImpl(final PL0OutputStreamWriter writer, final IFactory factory) {
        validateDependencies(writer, factory);

        this.writer = writer;
        this.factory = factory;
    }

    private void validateDependencies(final PL0OutputStreamWriter writer, final IFactory factory) {
        assertNotNull(writer, "Output writer may not be null");
        assertNotNull(factory, "Factory may not be null");
    }

    @Override
    public void enterProgram(final SimpleParser.ProgramContext ctx) {
        // first line in the program has to be a jump to the main function
        // we do not however know it's position yet, therefore we need to write stub first instruction like '0 JMP 0 X'
        // upon finishing compilation, this first line has to be overwritten by the correct position of the main function
        writer.writeNextInstruction("JMP", 0, 0);
    }

    @Override
    public void enterDeclaration(final SimpleParser.DeclarationContext ctx) {
        if (ctx.arrayTypeSpecifier() != null) {
            enterArrayDeclaration(ctx);
            return;
        }

        enterIntegerOrBooleanDeclaration(ctx);
    }

    @Override
    public void enterFunctionDeclaration(final SimpleParser.FunctionDeclarationContext context) {
        final String functionName = getUniqueFunctionName(context);
        final Function function = new FunctionImpl(getReturnTypeFromContext(context.functionReturnType()));

        int stackIncrementAmount = DEFAULT_STACK_INCREMENT_AMOUNT;
        if (hasFunctionParams(context)) {
            processFunctionParams(context, function);
            stackIncrementAmount = function.getStackTopIndex() + 1; // + 1, because index is starting at 0
        }

        writer.writeIncrementStackPointer(stackIncrementAmount);
        globalSymbolTable.put(functionName, new Symbol<>(functionName, function));
        currentScope = function;
    }

    @Override
    public void enterSelectionStatement(final SimpleParser.SelectionStatementContext context) {
        if (isIfStatement(context)) {
            enterIfStatement(context);
            return;
        }

        enterSwitchStatement(context);
    }

    @Override
    public void enterReturnStatement(final SimpleParser.ReturnStatementContext context) {
        final DataType returnType = context.expression() == null ? new Void() : getExpressionReturnValueType(context.expression(), globalSymbolTable, currentScope);
        final boolean returnsSameDataType = currentScope.getReturnType().isSameDataType(returnType);
        if (!returnsSameDataType) {
            throw new AnalysisException(context.Return().getSymbol(),
                    "Illegal return type. Expected: " + currentScope.getReturnType() + ", got: " + returnType);
        }

        //TODO parse the value (if there is one) to be returned
        writer.writeReturnInstruction();
        // TODO if there is a value to be returned, store on top of the stack
    }

    private void processFunctionParams(final SimpleParser.FunctionDeclarationContext context, final Function function) {
        for (final SimpleParser.FunctionDeclParamContext paramContext : context.functionDeclParams().functionDeclParam()) {
            if (isParameterArrayType(paramContext)) {
                final int arraySize = getArrayTypeParameterSize(paramContext.arrayTypeSpecifier());
                final Symbol<StackRecord> arrayStackRecordSymbol =
                        factory.createArrayStackRecordSymbol(getParameterIdentifier(paramContext), function.getAvailableStackIndex(), arraySize, null);
                function.addSymbol(arrayStackRecordSymbol);
            } else {
                final Symbol<StackRecord> integerStackRecordSymbol =
                        factory.createIntegerStackRecordSymbol(getParameterIdentifier(paramContext), function.getAvailableStackIndex(), false, null);
                function.addSymbol(integerStackRecordSymbol);
            }
        }
    }

    @Override
    public void enterMainFunctionDeclaration(final SimpleParser.MainFunctionDeclarationContext context) {
        final Function mainFunction = new FunctionImpl(getMainFunctionReturnType());
        globalSymbolTable.put(MAIN_FUNCTION_NAME, new Symbol<>(MAIN_FUNCTION_NAME, mainFunction));

        final int mainFunctionLineNumber = writer.getCurrentLineNumber();
        writer.writeIncrementStackPointer(DEFAULT_STACK_INCREMENT_AMOUNT);
        writer.updateInitialJump(mainFunctionLineNumber);

        currentScope = mainFunction;
    }

    @Override
    public void exitMainFunctionDeclaration(final SimpleParser.MainFunctionDeclarationContext ignored) {
        // on exiting main we know it's over - flushing the contents of the writer buffer into a file
        writer.flush();
    }

    @Override
    public void enterAssignment(final SimpleParser.AssignmentContext context) {
        if (isArrayAccess(context)) {
            throw new AnalysisException(context.getStart(), "Array access is unsupported operation at the moment");
        }

        final Token identifier = context.Identifier().getSymbol();
        final var symbol = currentScope.getSymbol(identifier.getText())
                .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' does not exist"));

        evaluateConditionalExpressionAssignment(context.conditionalExpression(), symbol, globalSymbolTable, writer, currentScope);
    }

    private void enterIntegerOrBooleanDeclaration(final SimpleParser.DeclarationContext context) {
        final boolean isConst = context.typeQualifier() != null;
        final String identifier = getUniqueVariableName(context.Identifier());
        final Symbol<StackRecord> stackRecordSymbol = factory.createIntegerStackRecordSymbol(identifier, currentScope.getAvailableStackIndex(), isConst, 0);

        final DataType leftSideDataType = stackRecordSymbol.getDescribedConstruction().getDataType();
        final DataType rightSideDataType = getConditionalExpressionReturnValueType(context.conditionalExpression(), globalSymbolTable, currentScope);
        if (!rightSideDataType.isSameDataType(leftSideDataType)) {
            throw new AnalysisException(context.conditionalExpression().getStart(),
                    "Value of type '" + rightSideDataType + "' not assignable to type '" + rightSideDataType + "'");
        }

        currentScope.addSymbol(stackRecordSymbol);
        final int stackIncrementAmount = stackRecordSymbol.getDescribedConstruction().getRecordSize();
        writer.writeIncrementStackPointer(stackIncrementAmount);

        if (context.conditionalExpression() == null) {
            saveValueToVariable(0, stackRecordSymbol, 0, writer);
            return;
        }

        evaluateConditionalExpressionDeclaration(context.conditionalExpression(), stackRecordSymbol, globalSymbolTable, writer, currentScope);
    }

    private void enterArrayDeclaration(final SimpleParser.DeclarationContext context) {
        final var arrayTypeSpecifier = context.arrayTypeSpecifier();
        final int arraySize = Integer.parseInt(arrayTypeSpecifier.NonzeroConstant().getText());
        final String identifier = getUniqueVariableName(context.Identifier());

        final Symbol<StackRecord> stackRecordSymbol = factory.createArrayStackRecordSymbol(identifier, currentScope.getAvailableStackIndex(), arraySize, new int[arraySize]);
        currentScope.addSymbol(stackRecordSymbol);
        final int stackIncrementAmount = stackRecordSymbol.getDescribedConstruction().getRecordSize();
        writer.writeIncrementStackPointer(stackIncrementAmount);

        // TODO kdyz zbyde cas tak do gramatiky pridat moznost "int[5] a = b;"
        initializeArray(stackRecordSymbol, currentScope, writer);
    }

    private void enterIfStatement(final SimpleParser.SelectionStatementContext context) {
        final var expression = context.condition().expression();
        final DataType dataType = getExpressionReturnValueType(expression, globalSymbolTable, currentScope);
        if (!isInteger(dataType)) {
            throw new AnalysisException(context.condition().getStart(),
                    "Condition has to evaluate into integer or boolean value (got " + dataType + ")");
        }

        if (isTernaryOperator(expression.conditionalExpression())) {
            throw new AnalysisException(expression.getStart(), "Condition may not be composed of other conditions");
        }

        if (isSignedConstant(expression) || isBooleanLiteral(expression)) {
            final int value = isSignedConstant(expression) ? evaluateSignedConstant(expression) : evaluateBooleanLiteral(expression);
            handleConditionWithConstantResult(context, value);
            return;
        }

        final var nonVoidValueInCondition = expression.conditionalExpression().nonVoidReturnValue();
        if (isIdentifierReference(nonVoidValueInCondition)) {
            final Token identifier = nonVoidValueInCondition.Identifier().getSymbol();
            final var symbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' does not exist"));
            final Optional<Object> value = symbol.getDescribedConstruction().getValue();
            // if we know the value at compile time, we can immediately evaluate the condition
            if (value.isPresent()) {
                handleConditionWithConstantResult(context, (Integer) value.get());
                return;
            }

            writer.writeLoadValueFromAddressOnStackTop(symbol.getDescribedConstruction().getRelativeStartIndex());
            writer.writePushToStack(0);
            writer.writeDoOperation(PL0Operation.NOT_EQUAL);
            // ... do if body if true

            inIfStatementBlock = true;
            ifJmcInstructionAddress = writer.getCurrentLineNumber();
            writer.writeNextInstruction("JMC", 0, 0);
            // don't know where to jump yet, will be updated upon exiting
        }

        if (isArrayAccess(nonVoidValueInCondition)) {
            final var arrayAccess = nonVoidValueInCondition.arrayAccess();
            // TODO array access
            final Token identifier = arrayAccess.Identifier().getSymbol();
            final var symbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' does not exist"));
            final Optional<Object> value = symbol.getDescribedConstruction().getValue();

            final var conditionalExpression = arrayAccess.conditionalExpression();
            if (isSignedConstant(conditionalExpression.nonVoidReturnValue()) || isBooleanLiteral(conditionalExpression.nonVoidReturnValue())) {
                final int index = isSignedConstant(expression) ? evaluateSignedConstant(expression) : evaluateBooleanLiteral(expression);
                if (index < 0) {
                    throw new AnalysisException(conditionalExpression.getStart(), "Cannot access on negative array index");
                }
                final int arraySize = symbol.getDescribedConstruction().getRecordSize();
                if (index >= arraySize) {
                    throw new AnalysisException(conditionalExpression.getStart(),
                            "Accessing index out of array bounds (accessed: " + index + ", arraySize: " + arraySize);
                }
            }
            // if we know the value at compile time, we can immediately evaluate the condition
            if (value.isPresent()) {
                final int[] arrayValue = (int[]) value.get();
            }
        }

        // TODO function call
    }

    private void handleConditionWithConstantResult(final SimpleParser.SelectionStatementContext context,
                                                   final int value) {
        if (value == 0) {
            if (context.Else() == null) {
                context.children = List.of();
                return;
            }

            context.scope(0).children = List.of();  // if there is an else branch we execute it always
            return;
        }


        if (context.Else() != null) {
            // if the condition is always true, we execute it always and possible else branch is ignored
            context.scope(1).children = List.of();
        }
    }

    @Override
    public void exitScope(final SimpleParser.ScopeContext ctx) {
        if (!(ctx.getParent() instanceof SimpleParser.SelectionStatementContext ifContext)) {
            return;
        }

        // TODO doplnit switch logiku
        if (inIfStatementBlock) {
            if (ifContext.Else() != null) {
                // if there is an else branch, we need to avoid its code with a jump, but we don't know where yet
                ifEndJmpInstructionAddress = writer.getCurrentLineNumber();
                writer.writeNextInstruction("JMP", 0, 0);
                inElseStatementBlock = true;
            }

            // we need to update the JNE instruction to jump behind the if scope logic
            // therefore we set the target address to here - the next instruction address
            writer.updateInstruction(ifJmcInstructionAddress, "JMC", 0, writer.getCurrentLineNumber());
            inIfStatementBlock = false;
            return;
        }

        if (inElseStatementBlock) {
            // we need to update the JMP instruction at the end of an if block to jump behind the else scope logic
            // therefore we set the target address to here - the next instruction address
            writer.updateInstruction(ifEndJmpInstructionAddress, "JMP", 0, writer.getCurrentLineNumber());
            inElseStatementBlock = false;
        }
    }

    private void enterSwitchStatement(final SimpleParser.SelectionStatementContext context) {

    }

    private String getUniqueFunctionName(final SimpleParser.FunctionDeclarationContext context) {
        final Token symbol = context.Identifier().getSymbol();
        final String functionName = symbol.getText();
        if (globalSymbolTable.containsKey(functionName)) {
            throw new AnalysisException(symbol,
                    "Repeated declaration of function '" + functionName + '\'');
        }

        return functionName;
    }

    private String getUniqueVariableName(final TerminalNode identifier) {
        final Token symbol = identifier.getSymbol();
        if (currentScope.getSymbol(symbol.getText()).isPresent()) {
            // here we take into consideration the entire scope (entire function scope)
            throw new AnalysisException(symbol, "Variable '" + symbol.getText() + "' already defined in scope");
        }

        return symbol.getText();
    }

}
