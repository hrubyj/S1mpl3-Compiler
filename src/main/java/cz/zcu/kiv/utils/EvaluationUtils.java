package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import org.antlr.v4.runtime.Token;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static cz.zcu.kiv.utils.ContextUtils.isBooleanLiteral;
import static cz.zcu.kiv.utils.ContextUtils.isIdentifierReference;
import static cz.zcu.kiv.utils.ContextUtils.isSignedConstant;
import static cz.zcu.kiv.utils.ContextUtils.isTernaryOperator;

public class EvaluationUtils {


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

    public static void evaluateTernaryOperator(final SimpleParser.ConditionalExpressionContext context,
                                               final Map<String, Symbol<Function>> globalSymbolTable,
                                               final PL0OutputStreamWriter writer,
                                               final Function currentScope) {
        final var nonVoidValue = context.nonVoidReturnValue();
        if (isSignedConstant(nonVoidValue) || isBooleanLiteral(nonVoidValue)) {
            final int conditionValue = isSignedConstant(nonVoidValue) ? evaluateSignedConstant(nonVoidValue) : evaluateBooleanLiteral(nonVoidValue);
            // always executing the ? or the : part
            evaluateTernaryOperatorWithConstantCondition(context, globalSymbolTable, writer, currentScope, conditionValue);
            return;
        }

        if (isIdentifierReference(nonVoidValue)) {
            final Token identifier = nonVoidValue.Identifier().getSymbol();
            final var symbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' does not exist"));
            final Optional<Object> value = symbol.getDescribedConstruction().getValue();
            // if we know the value at compile time, we can immediately evaluate the condition
            if (value.isPresent()) {
                evaluateTernaryOperatorWithConstantCondition(context, globalSymbolTable, writer, currentScope, (Integer) value.get());
                return;
            }



        }
        // array access
        // function call
    }

    private static void evaluateTernaryOperatorWithConstantCondition(final SimpleParser.ConditionalExpressionContext context,
                                                                     final Map<String, Symbol<Function>> globalSymbolTable,
                                                                     final PL0OutputStreamWriter writer,
                                                                     final Function currentScope,
                                                                     final int conditionValue) {
        final int expressionIndexToClear = conditionValue == 0 ? 0 : 1;
        context.expression(expressionIndexToClear).children = List.of();
        if (conditionValue == 0) {
            evaluateTernaryOperatorBranch(context.expression(1), globalSymbolTable, writer, currentScope);
            return;
        }

        evaluateTernaryOperatorBranch(context.expression(0), globalSymbolTable, writer, currentScope);
    }

    private static void evaluateTernaryOperatorBranch(final SimpleParser.ExpressionContext expression,
                                                      final Map<String, Symbol<Function>> globalSymbolTable,
                                                      final PL0OutputStreamWriter writer,
                                                      final Function currentScope) {
        if (isSignedConstant(expression) || isBooleanLiteral(expression)) {
            final int value = isSignedConstant(expression) ? evaluateSignedConstant(expression) : evaluateBooleanLiteral(expression);
            writer.writePushToStack(value);
            return;
        }

        if (isTernaryOperator(expression.conditionalExpression())) {
            evaluateTernaryOperator(expression.conditionalExpression(), globalSymbolTable, writer, currentScope);
            return;
        }

        final var nonVoidValue = expression.conditionalExpression().nonVoidReturnValue();
        if (isIdentifierReference(nonVoidValue)) {
            final Token identifier = nonVoidValue.Identifier().getSymbol();
            final var symbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Variable '" + identifier.getText() + "' does not exist"));
            writer.writeLoadValueFromAddressOnStackTop(symbol.getDescribedConstruction().getRelativeStartIndex());
            // TODO muze byt pole dopice
            // jako pri inicializaci pole, ale jenom se ulozi na stack
            return;
        }

        // TODO array access
        // TODO function call
    }

    private static int evaluateSignedConstant(final SimpleParser.SignedConstantContext context) {
        final int absoluteValue = Integer.parseInt(context.decimalConstant().getText());
        return context.Minus() != null ? -absoluteValue : absoluteValue;
    }
}
