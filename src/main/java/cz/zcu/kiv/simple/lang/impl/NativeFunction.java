package cz.zcu.kiv.simple.lang.impl;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.utils.AnalysisException;
import cz.zcu.kiv.utils.pl0.PL0Operation;
import cz.zcu.kiv.utils.pl0.PL0OutputStreamWriter;
import org.antlr.v4.runtime.Token;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

import static cz.zcu.kiv.utils.DataTypeUtils.isInteger;
import static cz.zcu.kiv.utils.EvaluationUtils.saveValueToVariable;
import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public enum NativeFunction {
    SUM("+", NativeFunction::evaluateSum),
    SUB("-", NativeFunction::evaluateSub),
    MULTIPLY("*", NativeFunction::evaluateMultiply),
    DIVIDE("/", NativeFunction::evaluateDivision),
    MOD("%", NativeFunction::unsupportedEvaluator),
    LESS("<", NativeFunction::unsupportedEvaluator),
    LESS_OR_EQUAL("<=", NativeFunction::unsupportedEvaluator),
    EQUAL("=", NativeFunction::unsupportedEvaluator),
    GREATER(">", NativeFunction::unsupportedEvaluator),
    GREATER_OR_EQUAL(">=", NativeFunction::unsupportedEvaluator),
    AND("AND", NativeFunction::unsupportedEvaluator),
    OR("OR", NativeFunction::unsupportedEvaluator),
    NEGATE("!", NativeFunction::unsupportedEvaluator);

    private final String name;

    private final FunctionEvaluator evaluator;

    NativeFunction(final String name, final FunctionEvaluator evaluator) {
        this.name = name;
        this.evaluator = evaluator;
    }

    public String getName() {
        return name;
    }

    public void evaluate(final SimpleParser.FunctionCallContext context, final Symbol<StackRecord> leftSideSymbol,
                         final Map<String, Symbol<Function>> globalSymbolTable,
                         final PL0OutputStreamWriter writer,
                         final Function currentScope) {
        evaluator.evaluateCall(context, leftSideSymbol, globalSymbolTable, writer, currentScope);
    }

    public static boolean isNativeFunctionName(final String name) {
        assertNotNull(name, "Name may not be null");
        return Arrays.stream(NativeFunction.values()).anyMatch(function -> name.equals(function.getName()));
    }

    public static NativeFunction getNativeFunction(final String name) {
        assertNotNull(name, "Name may not be null");
        return Arrays.stream(NativeFunction.values())
                .filter(function -> name.equals(function.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Native function '" + name + "' not found"));
    }


    private static void unsupportedEvaluator(final SimpleParser.FunctionCallContext context, final Symbol<StackRecord> leftSideSymbol,
                                             final Map<String, Symbol<Function>> globalSymbolTable,
                                             final PL0OutputStreamWriter writer,
                                             final Function currentScope) {
        throw new AnalysisException(context.getStart(), "Unsupported operation");
    }

    private static void checkUnsupportedParams(final SimpleParser.FunctionCallParamContext context) {
        if (context.arrayAccess() != null) {
            throw new AnalysisException(context.getStart(), "Array access is unsupported operation at the moment");
        }

        if (context.functionCall() != null) {
            throw new AnalysisException(context.getStart(), "Nested function call is unsupported operation at the moment");
        }
    }

    private static Symbol<StackRecord> getSymbol(final SimpleParser.FunctionCallParamContext param, final Function currentScope) {
        final Token identifier = param.Identifier().getSymbol();
        return currentScope.getSymbol(identifier.getText())
                .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' not found"));
    }

    private static void evaluateSum(final SimpleParser.FunctionCallContext context, final Symbol<StackRecord> leftSideSymbol,
                                    final Map<String, Symbol<Function>> globalSymbolTable,
                                    final PL0OutputStreamWriter writer,
                                    final Function currentScope) {
        if (context.functionCallParams().functionCallParam().size() <= 1) {
            throw new AnalysisException(context.getStart(), "Sum has to have two or more parameters");
        }

        int compileTimeTotal = 0;

        final var params = context.functionCallParams().functionCallParam();
        final var iterator = params.iterator();
        while (iterator.hasNext()) {
            final var param = iterator.next();
            checkUnsupportedParams(param);

            if (param.BooleanLiteral() != null) {
                final var value = param.BooleanLiteral().getText().equals("true") ? 1 : 0;
                compileTimeTotal += value;
                iterator.remove();
                continue;
            }

            if (param.decimalConstant() != null) {
                final var value = Integer.parseInt(param.decimalConstant().getText());
                compileTimeTotal += value;
                iterator.remove();
                continue;
            }

            final Token identifier = param.Identifier().getSymbol();
            final var symbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' not found"));
            if (!isInteger(symbol.getDescribedConstruction().getDataType())) {
                throw new AnalysisException(identifier, "Only integral values may be summed");
            }

            final Optional<Object> value = symbol.getDescribedConstruction().getValue();
            if (value.isPresent()) {
                compileTimeTotal += (int) value.get();
                iterator.remove();
            }
        }

        if (params.isEmpty()) {
            saveValueToVariable(compileTimeTotal, leftSideSymbol, 0, writer);
            return;
        }

        writer.writePushToStack(compileTimeTotal);
        for (final var param : params) {
            final Token identifier = param.Identifier().getSymbol();
            final var symbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' not found"));
            writer.writeLoadValueFromAddressOnStackTop(symbol.getDescribedConstruction().getRelativeStartIndex());
            writer.writeDoOperation(PL0Operation.ADD);
        }

        writer.writeStoreStackTopToAddress(leftSideSymbol.getDescribedConstruction().getRelativeStartIndex());
    }

    private static void evaluateSub(final SimpleParser.FunctionCallContext context, final Symbol<StackRecord> leftSideSymbol,
                                    final Map<String, Symbol<Function>> globalSymbolTable,
                                    final PL0OutputStreamWriter writer,
                                    final Function currentScope) {
        if (context.functionCallParams().functionCallParam().size() <= 1) {
            throw new AnalysisException(context.getStart(), "Subtraction has to have two or more parameters");
        }

        int compileTimeTotal = 0;

        final var params = context.functionCallParams().functionCallParam();
        final var iterator = params.iterator();
        while (iterator.hasNext()) {
            final var param = iterator.next();
            checkUnsupportedParams(param);

            if (param.BooleanLiteral() != null) {
                final var value = param.BooleanLiteral().getText().equals("true") ? 1 : 0;
                compileTimeTotal -= value;
                iterator.remove();
                continue;
            }

            if (param.decimalConstant() != null) {
                final var value = Integer.parseInt(param.decimalConstant().getText());
                compileTimeTotal -= value;
                iterator.remove();
                continue;
            }

            final Token identifier = param.Identifier().getSymbol();
            final var symbol = getSymbol(param, currentScope);
            if (!isInteger(symbol.getDescribedConstruction().getDataType())) {
                throw new AnalysisException(identifier, "Only integral values may be subtracted");
            }

            final Optional<Object> value = symbol.getDescribedConstruction().getValue();
            if (value.isPresent()) {
                compileTimeTotal -= (int) value.get();
                iterator.remove();
            }
        }

        if (params.isEmpty()) {
            saveValueToVariable(compileTimeTotal, leftSideSymbol, 0, writer);
            return;
        }

        writer.writePushToStack(compileTimeTotal);
        for (final var param : params) {
            final var symbol = getSymbol(param, currentScope);
            writer.writeLoadValueFromAddressOnStackTop(symbol.getDescribedConstruction().getRelativeStartIndex());
            writer.writeDoOperation(PL0Operation.SUB);
        }

        writer.writeStoreStackTopToAddress(leftSideSymbol.getDescribedConstruction().getRelativeStartIndex());
    }

    private static void evaluateMultiply(final SimpleParser.FunctionCallContext context, final Symbol<StackRecord> leftSideSymbol,
                                         final Map<String, Symbol<Function>> globalSymbolTable,
                                         final PL0OutputStreamWriter writer,
                                         final Function currentScope) {
        if (context.functionCallParams().functionCallParam().size() <= 1) {
            throw new AnalysisException(context.getStart(), "Multiplication has to have two or more parameters");
        }

        int compileTimeTotal = 1;

        final var params = context.functionCallParams().functionCallParam();
        final var iterator = params.iterator();
        while (iterator.hasNext()) {
            final var param = iterator.next();
            checkUnsupportedParams(param);

            if (param.BooleanLiteral() != null) {
                final var value = param.BooleanLiteral().getText().equals("true") ? 1 : 0;
                compileTimeTotal *= value;
                iterator.remove();
                continue;
            }

            if (param.decimalConstant() != null) {
                final var value = Integer.parseInt(param.decimalConstant().getText());
                compileTimeTotal *= value;
                iterator.remove();
                continue;
            }

            final Token identifier = param.Identifier().getSymbol();
            final var symbol = getSymbol(param, currentScope);
            if (!isInteger(symbol.getDescribedConstruction().getDataType())) {
                throw new AnalysisException(identifier, "Only integral values may be summed");
            }

            final Optional<Object> value = symbol.getDescribedConstruction().getValue();
            if (value.isPresent()) {
                compileTimeTotal *= (int) value.get();
                iterator.remove();
            }
        }

        if (params.isEmpty()) {
            saveValueToVariable(compileTimeTotal, leftSideSymbol, 0, writer);
            return;
        }

        writer.writePushToStack(compileTimeTotal);
        for (final var param : params) {
            final var symbol = getSymbol(param, currentScope);
            writer.writeLoadValueFromAddressOnStackTop(symbol.getDescribedConstruction().getRelativeStartIndex());
            writer.writeDoOperation(PL0Operation.MULTIPLY);
        }

        writer.writeStoreStackTopToAddress(leftSideSymbol.getDescribedConstruction().getRelativeStartIndex());
    }

    private static void evaluateDivision(final SimpleParser.FunctionCallContext context, final Symbol<StackRecord> leftSideSymbol,
                                         final Map<String, Symbol<Function>> globalSymbolTable,
                                         final PL0OutputStreamWriter writer,
                                         final Function currentScope) {
        if (context.functionCallParams().functionCallParam().size() <= 1) {
            throw new AnalysisException(context.getStart(), "Division has to have two or more parameters");
        }

        int compileTimeTotal = -1;

        final var params = context.functionCallParams().functionCallParam();
        final var iterator = params.iterator();
        while (iterator.hasNext()) {
            final var param = iterator.next();
            checkUnsupportedParams(param);

            if (param.BooleanLiteral() != null) {
                final var value = param.BooleanLiteral().getText().equals("true") ? 1 : 0;
                compileTimeTotal = compileTimeTotal == -1 ? value : compileTimeTotal / value;
                iterator.remove();
                continue;
            }

            if (param.decimalConstant() != null) {
                final var value = Integer.parseInt(param.decimalConstant().getText());
                compileTimeTotal = compileTimeTotal == -1 ? value : compileTimeTotal / value;
                iterator.remove();
                continue;
            }

            final Token identifier = param.Identifier().getSymbol();
            final var symbol = getSymbol(param, currentScope);
            if (!isInteger(symbol.getDescribedConstruction().getDataType())) {
                throw new AnalysisException(identifier, "Only integral values may be summed");
            }

            final Optional<Object> value = symbol.getDescribedConstruction().getValue();
            if (value.isPresent()) {
                compileTimeTotal = compileTimeTotal == -1 ? (int) value.get() : compileTimeTotal / (int) value.get();
                iterator.remove();
            }
        }

        if (params.isEmpty()) {
            saveValueToVariable(compileTimeTotal, leftSideSymbol, 0, writer);
            return;
        }

        if (compileTimeTotal != -1) {
            writer.writePushToStack(compileTimeTotal);
        }
        for (final var param : params) {
            final var symbol = getSymbol(param, currentScope);
            writer.writeLoadValueFromAddressOnStackTop(symbol.getDescribedConstruction().getRelativeStartIndex());
            if (compileTimeTotal != -1) {
                writer.writeDoOperation(PL0Operation.DIV);
                compileTimeTotal = 0;
            }
        }

        writer.writeStoreStackTopToAddress(leftSideSymbol.getDescribedConstruction().getRelativeStartIndex());
    }
}
