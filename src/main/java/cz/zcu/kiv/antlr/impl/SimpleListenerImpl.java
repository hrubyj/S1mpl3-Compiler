package cz.zcu.kiv.antlr.impl;

import cz.zcu.kiv.gen.SimpleBaseListener;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.impl.FunctionImpl;
import cz.zcu.kiv.utils.AnalysisException;
import cz.zcu.kiv.utils.ContextUtils;
import cz.zcu.kiv.utils.DataTypeUtils;
import cz.zcu.kiv.utils.IFactory;
import cz.zcu.kiv.utils.PL0OutputStreamWriter;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.Map;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class SimpleListenerImpl extends SimpleBaseListener {

    private static final String MAIN_FUNCTION_NAME = "main";
    public static final int DEFAULT_STACK_INCREMENT_AMOUNT = 3;

    private final Map<String, Symbol<Function>> globalSymbolTable = new HashMap<>();
    private Function currentScope;
    private int mainFunctionLineNumber;

    private final PL0OutputStreamWriter writer;
    private final IFactory factory;

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
    public void enterFunctionDeclaration(final SimpleParser.FunctionDeclarationContext context) {
        final String functionName = getUniqueFunctionName(context);
        final Function function = new FunctionImpl(DataTypeUtils.getReturnTypeFromContext(context.functionReturnType()));

        int stackIncrementAmount = DEFAULT_STACK_INCREMENT_AMOUNT;
        if (ContextUtils.hasFunctionParams(context)) {
            stackIncrementAmount = processFunctionParams(context, function);
        }

        writer.writeIncrementStackPointer(stackIncrementAmount);
        globalSymbolTable.put(functionName, new Symbol<>(functionName, function));
        currentScope = function;
    }

    @Override
    public void enterReturnStatement(final SimpleParser.ReturnStatementContext context) {
//        final SimpleParser.ExpressionContext returnExpression = context.expression();
        final boolean returnsSameDataType = currentScope.getReturnType().returnsSameDataType(context);
        if (!returnsSameDataType) {
            //TODO throw
        }

//        if (returnExpression == null) {
//            if (currentScope.getReturnType() != EnumDataType.VOID) {
//                final Token returnSymbol = context.Return().getSymbol();
//                throw new AnalysisException(returnSymbol.getLine(), TokenUtils.getTokenEndPositionInLine(returnSymbol),
//                        "Function has to return a non-void value");
//            }
//
//            // TODO what to do? jump somewhere backwards in call stack
//            return;
//        }
//
//        if (currentScope.getReturnType() == EnumDataType.VOID) {
//            throw new AnalysisException(returnExpression.getStart(),
//                    "Function of return type" + currentScope.getReturnType().name() + "may not return a non-void value");
//        }
//
//        // TODO validate expression for all possible return types
    }

    private int processFunctionParams(final SimpleParser.FunctionDeclarationContext context, final Function function) {
        int stackIncrementAmount = DEFAULT_STACK_INCREMENT_AMOUNT;
        for (final SimpleParser.FunctionDeclParamContext paramContext : context.functionDeclParams().functionDeclParam()) {
            if (ContextUtils.isParameterArrayType(paramContext)) {
                final int arraySize = ContextUtils.getArrayTypeParameterSize(paramContext.arrayTypeSpecifier());
                final Symbol<StackRecord> arrayStackRecordSymbol =
                        factory.createArrayStackRecordSymbol(ContextUtils.getParameterIdentifier(paramContext), stackIncrementAmount, arraySize);
                function.addSymbol(arrayStackRecordSymbol);
                stackIncrementAmount += arrayStackRecordSymbol.getDescribedConstruction().getRecordSize();
            } else {
                final Symbol<StackRecord> integerStackRecordSymbol =
                        factory.createIntegerStackRecordSymbol(ContextUtils.getParameterIdentifier(paramContext), stackIncrementAmount);
                function.addSymbol(integerStackRecordSymbol);
                stackIncrementAmount += integerStackRecordSymbol.getDescribedConstruction().getRecordSize();
            }
        }
        return stackIncrementAmount;
    }

    @Override
    public void enterMainFunctionDeclaration(final SimpleParser.MainFunctionDeclarationContext context) {
        final Function mainFunction = new FunctionImpl(DataTypeUtils.getMainFunctionReturnType());
        globalSymbolTable.put(MAIN_FUNCTION_NAME, new Symbol<>(MAIN_FUNCTION_NAME, mainFunction));
        mainFunctionLineNumber = writer.getCurrentLineNumber();
        currentScope = mainFunction;
    }

    @Override
    public void exitMainFunctionDeclaration(final SimpleParser.MainFunctionDeclarationContext ctx) {
        // main is always the last function - when we finish its compilation, we may update the initial jump to its position
        writer.updateInitialJump(mainFunctionLineNumber);
    }

    @Override
    public void enterFunctionDeclParam(final SimpleParser.FunctionDeclParamContext ctx) {
        super.enterFunctionDeclParam(ctx);
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


}
