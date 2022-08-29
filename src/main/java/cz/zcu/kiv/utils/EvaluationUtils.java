package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.datatype.DataType;
import cz.zcu.kiv.utils.pl0.PL0Operation;
import cz.zcu.kiv.utils.pl0.PL0OutputStreamWriter;
import org.antlr.v4.runtime.Token;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static cz.zcu.kiv.utils.ContextUtils.isArrayAccess;
import static cz.zcu.kiv.utils.ContextUtils.isBooleanLiteral;
import static cz.zcu.kiv.utils.ContextUtils.isIdentifierReference;
import static cz.zcu.kiv.utils.ContextUtils.isSignedConstant;
import static cz.zcu.kiv.utils.ContextUtils.isTernaryOperator;
import static cz.zcu.kiv.utils.DataTypeUtils.getConditionalExpressionReturnValueType;
import static cz.zcu.kiv.utils.DataTypeUtils.isInteger;
import static cz.zcu.kiv.utils.ValidationUtils.assertNotEmpty;
import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class EvaluationUtils {

    public static void evaluateConditionalExpressionAssignment(final SimpleParser.ConditionalExpressionContext context,
                                                               final Symbol<StackRecord> leftSideSymbol,
                                                               final Map<String, Symbol<Function>> globalSymbolTable,
                                                               final PL0OutputStreamWriter writer,
                                                               final Function currentScope) {
        assertNotNull(leftSideSymbol, "Left hand symbol may not be null");
        assertNotNull(context, "Conditional expression may not be null");

        if (leftSideSymbol.getDescribedConstruction().isConst()) {
            throw new AnalysisException(context.getStart(), "Cannot assign to a constant variable");
        }

        final DataType leftSideDataType = leftSideSymbol.getDescribedConstruction().getDataType();
        final DataType rightSideDataType = getConditionalExpressionReturnValueType(context, globalSymbolTable, currentScope);
        if (!leftSideDataType.isSameDataType(rightSideDataType)) {
            throw new AnalysisException(context.getStart(), "Value of type '" + rightSideDataType + "' not assignable to type '" + leftSideDataType + "'");
        }

        evaluateConditionalExpressionDeclaration(context, leftSideSymbol, globalSymbolTable, writer, currentScope);
    }

    public static void evaluateConditionalExpressionDeclaration(final SimpleParser.ConditionalExpressionContext context,
                                                                final Symbol<StackRecord> leftSideSymbol,
                                                                final Map<String, Symbol<Function>> globalSymbolTable,
                                                                final PL0OutputStreamWriter writer,
                                                                final Function currentScope) {
        assertNotNull(context, "Conditional expression may not be null");
        assertNotNull(globalSymbolTable, "Global symbol table may not be null");
        assertNotNull(writer, "Writer may not be null");
        assertNotNull(currentScope, "Current scope may not be null");

        if (isTernaryOperator(context)) {
            evaluateTernaryOperator(context, leftSideSymbol, globalSymbolTable, writer, currentScope);
            return;
        }

        final var nonVoidValue = context.nonVoidReturnValue();
        if (isArrayAccess(nonVoidValue)) {
            throw new AnalysisException(nonVoidValue.getStart(), "Array access is unsupported operation at the moment");
        }

        if (isBooleanLiteral(nonVoidValue) || isSignedConstant(nonVoidValue)) {
            final int value = isBooleanLiteral(nonVoidValue) ? evaluateBooleanLiteral(nonVoidValue) : evaluateSignedConstant(nonVoidValue);
            leftSideSymbol.getDescribedConstruction().setValue(value);
            saveValueToVariable(value, leftSideSymbol, 0, writer);
            return;
        }

        if (isIdentifierReference(nonVoidValue)) {
            final Token rValueIdentifier = nonVoidValue.Identifier().getSymbol();
            final var rValueStackRecordSymbol = currentScope.getSymbol(rValueIdentifier.getText())
                    .orElseThrow(() -> new AnalysisException(rValueIdentifier, "Variable '" + rValueIdentifier.getText() + "' does not exist"));
            // same data types already checked above
            final int rValueAddress = rValueStackRecordSymbol.getDescribedConstruction().getRelativeStartIndex();
            final Object value = rValueStackRecordSymbol.getDescribedConstruction().getValue();
            leftSideSymbol.getDescribedConstruction().setValue(value);

            final DataType leftSideDataType = leftSideSymbol.getDescribedConstruction().getDataType();
            if (isInteger(leftSideDataType)) {
                writer.writeLoadValueFromAddressOnStackTop(rValueAddress);
                writer.writeStoreStackTopToAddress(leftSideSymbol.getDescribedConstruction().getRelativeStartIndex());
                return;
            }

            copyArray(leftSideSymbol, rValueStackRecordSymbol, currentScope, writer);
            return;
        }

        // TODO function call
    }

    public static int evaluateBooleanLiteral(final SimpleParser.NonVoidReturnValueContext context) {
        if (!isBooleanLiteral(context)) {
            throw new IllegalArgumentException("Context may not be null and has to be a boolean literal");
        }

        return context.BooleanLiteral().getText().equals("true") ? 1 : 0;
    }

    public static int evaluateBooleanLiteral(final SimpleParser.ExpressionContext context) {
        if (!isBooleanLiteral(context)) {
            throw new IllegalArgumentException("Context may not be null and has to be a boolean literal");
        }

        return context.BooleanLiteral() != null ?
                context.BooleanLiteral().getText().equals("true") ? 1 : 0 :
                evaluateBooleanLiteral(context.conditionalExpression().nonVoidReturnValue());
    }

    public static int evaluateSignedConstant(final SimpleParser.NonVoidReturnValueContext context) {
        if (!isSignedConstant(context)) {
            throw new IllegalArgumentException("Context may not be null and has to be a signed constant");
        }

        return evaluateSignedConstant(context.signedConstant());
    }

    public static int evaluateSignedConstant(final SimpleParser.ExpressionContext context) {
        if (!isSignedConstant(context)) {
            throw new IllegalArgumentException("Context may not be null and has to be a signed constant");
        }

        return context.signedConstant() != null ?
                evaluateSignedConstant(context.signedConstant()) :
                evaluateSignedConstant(context.conditionalExpression().nonVoidReturnValue());
    }

    private static void evaluateTernaryOperator(final SimpleParser.ConditionalExpressionContext context,
                                                final Symbol<StackRecord> leftSideSymbol,
                                                final Map<String, Symbol<Function>> globalSymbolTable,
                                                final PL0OutputStreamWriter writer,
                                                final Function currentScope) {
        final var nonVoidValue = context.nonVoidReturnValue();
        if (isArrayAccess(nonVoidValue)) {
            throw new AnalysisException(nonVoidValue.getStart(), "Array access is unsupported operation at the moment");
        }

        if (isSignedConstant(nonVoidValue) || isBooleanLiteral(nonVoidValue)) {
            final int conditionValue = isSignedConstant(nonVoidValue) ? evaluateSignedConstant(nonVoidValue) : evaluateBooleanLiteral(nonVoidValue);
            // always executing the ? or the : part
            evaluateTernaryOperatorWithConstantCondition(context, leftSideSymbol, globalSymbolTable, writer, currentScope, conditionValue);
            return;
        }

        if (isIdentifierReference(nonVoidValue)) {
            final Token identifier = nonVoidValue.Identifier().getSymbol();
            final var symbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' does not exist"));
            final Optional<Object> value = symbol.getDescribedConstruction().getValue();
            // if we know the value at compile time, we can immediately evaluate the condition
            if (value.isPresent()) {
                evaluateTernaryOperatorWithConstantCondition(context, leftSideSymbol, globalSymbolTable, writer, currentScope, (Integer) value.get());
                return;
            }

            writer.writeLoadValueFromAddressOnStackTop(symbol.getDescribedConstruction().getRelativeStartIndex());
            writer.writePushToStack(0);
            writer.writeDoOperation(PL0Operation.NOT_EQUAL);

            final int jmcInstructionAddress = writer.getCurrentLineNumber();
            writer.writeNextInstruction("JMC", 0, 0);
            // don't know where to jump yet, will be updated upon exiting
            evaluateTernaryOperatorBranch(context.expression(0), leftSideSymbol, globalSymbolTable, writer, currentScope);
            final int elseBranchAddress = writer.getCurrentLineNumber();
            writer.updateInstruction(jmcInstructionAddress, "JMC", 0, elseBranchAddress);

            evaluateTernaryOperatorBranch(context.expression(1), leftSideSymbol, globalSymbolTable, writer, currentScope);
        }

        // TODO function call
    }

    public static void evaluateForLoop(final String tempVariableName, final int stopIndex,
                                       final PL0OutputStreamWriter writer, final Function currentScope,
                                       final IFactory factory,
                                       final java.util.function.BiConsumer<Integer, Optional<Symbol<StackRecord>>> loopBody) {
        if (loopBody == null) {
            return; // if loop body is empty, we might as well just ignore the whole loop
        }
        assertNotNull(writer, "Writer may not be null");
        if (tempVariableName != null) {
            assertNotNull(factory, "Factory may not be null");
        }

        final int tempVariableIndex = currentScope.getAvailableStackIndex();
        Optional<Symbol<StackRecord>> tempVariableStackRecord = Optional.empty();
        if (tempVariableName != null) {
            assertNotEmpty(tempVariableName, "Variable name may not be empty");
            final var stackRecord = factory.createIntegerStackRecordSymbol(tempVariableName, tempVariableIndex, false, 0);
            currentScope.addSymbol(stackRecord);
            tempVariableStackRecord = Optional.of(stackRecord);
        }

        writer.writeIncrementStackPointer(1);
        saveValueToIndex(0, tempVariableIndex, 0, writer);

        final int loopBeginAddress = writer.getCurrentLineNumber();
        writer.writeLoadValueFromAddressOnStackTop(tempVariableIndex);
        writer.writePushToStack(stopIndex);
        writer.writeDoOperation(PL0Operation.LESS_THAN);

        final int jumpCompareInstructionAddress = writer.getCurrentLineNumber();
        writer.writeNextInstruction("JMC", 0, 0);   // we don't know where to jump yet, will update later

        loopBody.accept(tempVariableIndex, tempVariableStackRecord);

        // end of loop logic
        tempVariableStackRecord.ifPresent(stackRecordSymbol -> {
            @SuppressWarnings("OptionalGetWithoutIsPresent") final int previousValue = (int) stackRecordSymbol.getDescribedConstruction().getValue().get();
            stackRecordSymbol.getDescribedConstruction().setValue(previousValue + 1);
        });

        writer.writeLoadValueFromAddressOnStackTop(tempVariableIndex);
        writer.writePushToStack(1);
        writer.writeDoOperation(PL0Operation.ADD);
        writer.writeStoreStackTopToAddress(tempVariableIndex);  // saving incremented value back to temp
        writer.writeNextInstruction("JMP", 0, loopBeginAddress); // at the end of loop scope we jump back to start

        final int endOfLoopIndex = writer.getCurrentLineNumber();   // now we know where we should jump - updating
        writer.updateInstruction(jumpCompareInstructionAddress, "JMC", 0, endOfLoopIndex);
        currentScope.removeSymbol(tempVariableName);
    }

    public static void initializeArray(final Symbol<StackRecord> arraySymbol, final Function currentScope, final PL0OutputStreamWriter writer) {
        assertNotNull(arraySymbol, "Array symbol may not be null");
        assertNotNull(writer, "Writer may not be null");

        final int startIndex = arraySymbol.getDescribedConstruction().getRelativeStartIndex();
        final int size = arraySymbol.getDescribedConstruction().getRecordSize();

        if (shouldArrayBeQuickProcessed(size)) {
            for (int i = 0; i < size; i++) {
                saveValueToIndex(0, startIndex + i, 0, writer);
            }
            return;
        }

        evaluateForLoop(null, size, writer, currentScope, null,
                (tempVariableIndex, tempVariableStackRecord) -> {
                    writer.writePushToStack(0); // value to save
                    writer.writePushToStack(0); // level
                    writer.writeNextInstruction("LIT", 0, startIndex);
                    writer.writeLoadValueFromAddressOnStackTop(tempVariableIndex);
                    writer.writeDoOperation(PL0Operation.ADD);
                    writer.writeNextInstruction("PST", 0, 0);
                });
    }

    private static void evaluateTernaryOperatorWithConstantCondition(final SimpleParser.ConditionalExpressionContext context,
                                                                     final Symbol<StackRecord> leftSideSymbol,
                                                                     final Map<String, Symbol<Function>> globalSymbolTable,
                                                                     final PL0OutputStreamWriter writer,
                                                                     final Function currentScope,
                                                                     final int conditionValue) {
        final int expressionIndexToClear = conditionValue == 0 ? 0 : 1;
        context.expression(expressionIndexToClear).children = List.of();
        if (conditionValue == 0) {
            evaluateTernaryOperatorBranch(context.expression(1), leftSideSymbol, globalSymbolTable, writer, currentScope);
            return;
        }

        evaluateTernaryOperatorBranch(context.expression(0), leftSideSymbol, globalSymbolTable, writer, currentScope);
    }

    private static void evaluateTernaryOperatorBranch(final SimpleParser.ExpressionContext expression,
                                                      final Symbol<StackRecord> leftSideSymbol,
                                                      final Map<String, Symbol<Function>> globalSymbolTable,
                                                      final PL0OutputStreamWriter writer,
                                                      final Function currentScope) {
        if (isSignedConstant(expression) || isBooleanLiteral(expression)) {
            final int value = isSignedConstant(expression) ? evaluateSignedConstant(expression) : evaluateBooleanLiteral(expression);
            saveValueToVariable(value, leftSideSymbol, 0, writer);
            return;
        }

        if (isTernaryOperator(expression.conditionalExpression())) {
            evaluateTernaryOperator(expression.conditionalExpression(), leftSideSymbol, globalSymbolTable, writer, currentScope);
            return;
        }

        final var nonVoidValue = expression.conditionalExpression().nonVoidReturnValue();
        if (isArrayAccess(nonVoidValue)) {
            throw new AnalysisException(nonVoidValue.getStart(), "Array access is unsupported operation at the moment");
        }

        if (isIdentifierReference(nonVoidValue)) {
            final Token identifier = nonVoidValue.Identifier().getSymbol();
            final var rightSideSymbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' does not exist"));
            final var dataType = rightSideSymbol.getDescribedConstruction().getDataType();
            if (isInteger(dataType)) {
                writer.writeLoadValueFromAddressOnStackTop(rightSideSymbol.getDescribedConstruction().getRelativeStartIndex());
                writer.writeStoreStackTopToAddress(leftSideSymbol.getDescribedConstruction().getRelativeStartIndex());
                return;
            }

            copyArray(leftSideSymbol, rightSideSymbol, currentScope, writer);
            return;
        }

        // TODO function call
    }

    private static int evaluateSignedConstant(final SimpleParser.SignedConstantContext context) {
        final int absoluteValue = Integer.parseInt(context.decimalConstant().getText());
        return context.Minus() != null ? -absoluteValue : absoluteValue;
    }

    public static void saveValueToVariable(final int value, final Symbol<StackRecord> stackRecordSymbol,
                                           final int level, final PL0OutputStreamWriter writer) {
        saveValueToIndex(value, stackRecordSymbol.getDescribedConstruction().getRelativeStartIndex(), level, writer);
    }

    public static void saveValueToIndex(final int value, final int index, final int level, final PL0OutputStreamWriter writer) {
        writer.writePushToStack(value);
        writer.writeStoreStackTopToAddress(index);
    }

    private static void copyArray(final Symbol<StackRecord> leftSideArraySymbol,
                                  final Symbol<StackRecord> rightSideArraySymbol,
                                  final Function currentScope,
                                  final PL0OutputStreamWriter writer) {
        final int leftSideStartIndex = leftSideArraySymbol.getDescribedConstruction().getRelativeStartIndex();
        final int rightSideStartIndex = rightSideArraySymbol.getDescribedConstruction().getRelativeStartIndex();
        final int size = leftSideArraySymbol.getDescribedConstruction().getRecordSize();

        if (shouldArrayBeQuickProcessed(size)) {
            for (int i = 0; i < size; i++) {
                writer.writeLoadValueFromAddressOnStackTop(rightSideStartIndex + i);
                writer.writeStoreStackTopToAddress(leftSideStartIndex + i);
            }
            return;
        }

        evaluateForLoop(null, size, writer, currentScope, null,
                (tempVariableIndex, tempVariableStackRecord) -> {
                    writer.writePushToStack(0); // level
                    writer.writeNextInstruction("LIT", 0, rightSideStartIndex);
                    writer.writeLoadValueFromAddressOnStackTop(tempVariableIndex);
                    writer.writeDoOperation(PL0Operation.ADD);
                    writer.writeNextInstruction("PLD", 0, 0);   // reads from stack and stores to stack

                    writer.writePushToStack(0); // level
                    writer.writeNextInstruction("LIT", 0, leftSideStartIndex);
                    writer.writeLoadValueFromAddressOnStackTop(tempVariableIndex);
                    writer.writeDoOperation(PL0Operation.ADD);  // iterating from array end to start
                    writer.writeNextInstruction("PST", 0, 0);   // reads from stack and stores to stack
                });
    }

    private static void pushArrayToStack(final Symbol<StackRecord> arraySymbol,
                                         final Function currentScope,
                                         final PL0OutputStreamWriter writer) {
        final int startIndex = arraySymbol.getDescribedConstruction().getRelativeStartIndex();
        final int size = arraySymbol.getDescribedConstruction().getRecordSize();

        // logic to implement for-loop is approx. 10 lines
        // logic to manually push values into each index is 2 lines per index
        // we check which one produces less code
        if (shouldArrayBeQuickProcessed(size)) {
            for (int i = 0; i < size; i++) {
                writer.writeLoadValueFromAddressOnStackTop(startIndex + i);
            }
            return;
        }

        evaluateForLoop(null, size, writer, currentScope, null,
                (tempVariableIndex, tempVariableStackRecord) -> {
                    writer.writePushToStack(0); // level
                    writer.writeNextInstruction("LIT", 0, startIndex);
                    writer.writeLoadValueFromAddressOnStackTop(tempVariableIndex);
                    writer.writeDoOperation(PL0Operation.ADD);
                    writer.writeNextInstruction("PLD", 0, 0);   // reads from stack and stores to stack
                });
    }

    private static void popArrayFromStackToVariable(final Symbol<StackRecord> arraySymbol,
                                                    final Function currentScope,
                                                    final PL0OutputStreamWriter writer) {
        final int startIndex = arraySymbol.getDescribedConstruction().getRelativeStartIndex();
        final int size = arraySymbol.getDescribedConstruction().getRecordSize();

        // logic to implement for-loop is approx. 10 lines
        // logic to manually push values into each index is 2 lines per index
        // we check which one produces less code
        if (shouldArrayBeQuickProcessed(size)) {
            for (int i = size - 1; i >= 0; i--) {
                writer.writeStoreStackTopToAddress(startIndex + i);
            }
            return;
        }


        evaluateForLoop(null, size, writer, currentScope, null,
                (tempVariableIndex, tempVariableStackRecord) -> {
                    writer.writePushToStack(0); // level
                    writer.writeNextInstruction("LIT", 0, startIndex + (size - 1));
                    writer.writeLoadValueFromAddressOnStackTop(tempVariableIndex);
                    writer.writeDoOperation(PL0Operation.SUB);  // iterating from array end to start
                    writer.writeNextInstruction("PST", 0, 0);   // reads from stack and stores to stack
                });
    }

    private static boolean shouldArrayBeQuickProcessed(final int size) {
        // logic to implement for-loop is approx. 10 lines
        // logic to manually push values into each index is 2 lines per index
        // we check which one produces less code
        return size * 2 < 10;
    }
}
