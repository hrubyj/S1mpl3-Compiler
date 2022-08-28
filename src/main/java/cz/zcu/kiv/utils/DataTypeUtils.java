package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.datatype.DataType;
import cz.zcu.kiv.simple.lang.datatype.impl.Array;
import cz.zcu.kiv.simple.lang.datatype.impl.Integer;
import cz.zcu.kiv.simple.lang.datatype.impl.Void;
import org.antlr.v4.runtime.Token;

import java.util.Map;

import static cz.zcu.kiv.utils.ContextUtils.isArrayAccess;
import static cz.zcu.kiv.utils.ContextUtils.isBooleanLiteral;
import static cz.zcu.kiv.utils.ContextUtils.isFunctionCall;
import static cz.zcu.kiv.utils.ContextUtils.isSignedConstant;
import static cz.zcu.kiv.utils.ContextUtils.isTernaryOperator;
import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class DataTypeUtils {

    public static DataType getReturnTypeFromContext(final SimpleParser.FunctionReturnTypeContext context) {
        if (context == null) {
            return null;
        }

        if (returnsArray(context)) {
            final var arrayContext = context.arrayTypeSpecifier();
            return new Array(ContextUtils.getArrayTypeParameterSize(arrayContext));
        }

        return context.baseTypeSpecifier().Void() == null ? new Integer() : new Void();
    }

    public static DataType getMainFunctionReturnType() {
        return new Void();
    }

    private static boolean returnsArray(final SimpleParser.FunctionReturnTypeContext context) {
        return context.baseTypeSpecifier() == null;
    }

    public static DataType getNonVoidReturnValueType(final SimpleParser.NonVoidReturnValueContext context,
                                                     final Map<String, Symbol<Function>> globalSymbolTable,
                                                     final Function currentScope) {
        if (isBooleanLiteral(context) || isSignedConstant(context)) {
            return new Integer();   // boolean is internally an integer
        }

        if (isArrayAccess(context)) {
            final Token identifier = context.arrayAccess().Identifier().getSymbol();
            final Symbol<StackRecord> stackRecordSymbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Stack record for identifier " + identifier.getText() + " not found"));

            return stackRecordSymbol.getDescribedConstruction().getDataType();
        }

        if (isFunctionCall(context)) {
            final var functionCall = context.functionCall();
            // instance of and unary operator functions return boolean or integer
            if (functionCall.Instanceof() != null || functionCall.unaryOperator() != null) {
                return new Integer();
            }

            final var functionIdentifier = context.functionCall().functionIdentifier();
            final String functionName = functionIdentifier.getText();
            if (globalSymbolTable.get(functionName) == null) {
                throw new AnalysisException(functionIdentifier.getStart(), "Function " + functionName + " not found");
            }

            return globalSymbolTable.get(functionName).getDescribedConstruction().getReturnType();
        }

        // identifier reference
        final String identifier = context.Identifier().getText();
        final Symbol<StackRecord> symbol = currentScope.getSymbol(identifier)
                .orElseThrow(() -> new AnalysisException(context.Identifier().getSymbol(), "Symbol for identifier '" + identifier + "' not found"));

        return symbol.getDescribedConstruction().getDataType();
    }

    public static DataType getExpressionReturnValueType(final SimpleParser.ExpressionContext expressionCtx,
                                                        final Map<String, Symbol<Function>> globalSymbolTable,
                                                        final Function currentScope) {
        assertNotNull(expressionCtx, "Expression context may not be null");
        assertNotNull(globalSymbolTable, "Global symbol table may not be null");
        assertNotNull(currentScope, "Current scope may not be null");

        // assignment does not return anything, signed, unsigned and boolean values are internally all integers
        if (expressionCtx.conditionalExpression() == null) {
            return expressionCtx.assignment() != null ? new Void() : new Integer();
        }

        // careful, recursive calls inside
        return getConditionalExpressionReturnValueType(expressionCtx.conditionalExpression(), globalSymbolTable, currentScope);
    }


    public static DataType getConditionalExpressionReturnValueType(final SimpleParser.ConditionalExpressionContext condExpression,
                                                                   final Map<String, Symbol<Function>> globalSymbolTable,
                                                                   final Function currentScope) {
        assertNotNull(condExpression, "Conditional expression context may not be null");
        assertNotNull(globalSymbolTable, "Global symbol table may not be null");
        assertNotNull(currentScope, "Current scope may not be null");

        if (!isTernaryOperator(condExpression)) {
            return getNonVoidReturnValueType(condExpression.nonVoidReturnValue(), globalSymbolTable, currentScope);
        }

        // first part of a ternary operator has to return an integral value or boolean - so we can say it is truthy or falsy
        // if it returns an array, it is incorrect
        final DataType dataType = getNonVoidReturnValueType(condExpression.nonVoidReturnValue(), globalSymbolTable, currentScope);
        if (dataType instanceof Array) {
            throw new AnalysisException(condExpression.getStart(),
                    "Condition part of ternary operator has to be evaluated as integer or boolean. (got Array)");
        }

        final DataType firstExpressionDataType = getExpressionReturnValueType(condExpression.expression(0), globalSymbolTable, currentScope);
        final DataType secondExpressionDataType = getExpressionReturnValueType(condExpression.expression(1), globalSymbolTable, currentScope);
        if (!firstExpressionDataType.isSameDataType(secondExpressionDataType)) {
            throw new AnalysisException(condExpression.getStart(),
                    "Conditional expression has to return equal data types in all cases. " +
                            "(Got " + firstExpressionDataType + " and " + secondExpressionDataType + ")");
        }

        // returning one or the other, both are the same
        return firstExpressionDataType;
    }

    public static boolean isSameDataType(final Symbol<StackRecord> stackRecordSymbol, final DataType dataType) {
        assertNotNull(stackRecordSymbol, "Stack record symbol may not be null");
        assertNotNull(dataType, "Data type may not be null");

        return stackRecordSymbol.getDescribedConstruction().getDataType().isSameDataType(dataType);
    }

    public static boolean isInteger(final DataType dataType) {
        assertNotNull(dataType, "Data type may not be null");

        return dataType.isSameDataType(new Integer());
    }
}
