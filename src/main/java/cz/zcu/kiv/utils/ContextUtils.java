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
import java.util.Stack;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class ContextUtils {

    public static String getParameterIdentifier(final SimpleParser.FunctionDeclParamContext context) {
        if (context == null) {
            return null;
        }

        return context.Identifier().getSymbol().getText();
    }

    public static int getArrayTypeParameterSize(final SimpleParser.ArrayTypeSpecifierContext context) {
        if (context == null) {
            return 0;
        }

        return java.lang.Integer.parseInt(context.NonzeroConstant().getSymbol().getText());
    }

    public static boolean isParameterArrayType(final SimpleParser.FunctionDeclParamContext context) {
        if (context == null) {
            return false;
        }

        return context.arrayTypeSpecifier() != null;
    }

    public static boolean hasFunctionParams(final SimpleParser.FunctionDeclarationContext context) {
        if (context == null) {
            return false;
        }

        return context.functionDeclParams() != null;
    }

    public static DataType getNonVoidReturnValueType(final SimpleParser.NonVoidReturnValueContext context,
                                                     final Map<String, Symbol<Function>> globalSymbolTable,
                                                     final Function currentScope) {
        // array may only be returned from function call or by an identifier
        // array access and boolean literal do not allow this
        if (context.functionCall() == null && context.Identifier() == null) {
            if (context.BooleanLiteral() != null) {
                return new Integer();   // boolean is internally an integer
            }

            // now we know it's an array, so we might as well just return it - no need to create new instance
            final Token identifier = context.arrayAccess().Identifier().getSymbol();
            final Symbol<StackRecord> stackRecordSymbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Stack record for identifier " + identifier.getText() + " not found"));

            return stackRecordSymbol.getDescribedConstruction().getDataType();
        }

        if (context.functionCall() != null) {
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

        final Stack<SimpleParser.ExpressionContext> expressionContexts = new Stack<>();
        expressionContexts.push(expressionCtx);
        while (!expressionContexts.isEmpty()) {
            final var topExpressionContext = expressionContexts.pop();
            if (topExpressionContext == null) {
                throw new NullPointerException("Expression context is null");
            }

            // assignment does not return anything, signed, unsigned and boolean values are internally all integers
            if (topExpressionContext.conditionalExpression() == null) {
                return topExpressionContext.assignment() != null ? new Void() : new Integer();
            }

            final var condExpression = topExpressionContext.conditionalExpression();
            // without colon, we know the expression is not the entire ternary operator
            if (condExpression.Colon() == null) {
                return getNonVoidReturnValueType(condExpression.nonVoidReturnValue(), globalSymbolTable, currentScope);
            }

            // first part of a ternary operator has to return an integral value or boolean - so we can say it is truthy or falsy
            // if it returns an array, it is incorrect
            final DataType dataType = getNonVoidReturnValueType(condExpression.nonVoidReturnValue(), globalSymbolTable, currentScope);
            if (dataType instanceof Array) {
                throw new AnalysisException(condExpression.getStart(),
                        "Condition part of ternary operator has to be evaluated as integer or boolean. (got Array)");
            }

            for (final var nestedExpressionContext : condExpression.expression()) {
                expressionContexts.push(nestedExpressionContext);
            }
        }

        // safety break for compiler - we should never get to this point
        throw new IllegalStateException("Expression context evaluated without a return value");

    }

    public static void evaluateExpression(final SimpleParser.ExpressionContext expressionCtx,
                                          final Map<String, Symbol<Function>> globalSymbolTable,
                                          final Function currentScope) {
        assertNotNull(expressionCtx, "Expression context may not be null");
        assertNotNull(globalSymbolTable, "Global symbol table may not be null");
        assertNotNull(currentScope, "Current scope may not be null");

        final Stack<SimpleParser.ExpressionContext> expressionContexts = new Stack<>();
        expressionContexts.push(expressionCtx);
        while (!expressionContexts.isEmpty()) {
            final var topExpressionContext = expressionContexts.pop();
            if (topExpressionContext == null) {
                throw new NullPointerException("Expression context is null");
            }

            if (topExpressionContext.conditionalExpression() == null) {
                if (topExpressionContext.assignment() != null) {
                    // assignment
                    evaluateAssignment(topExpressionContext.assignment(), globalSymbolTable, currentScope);
                }

                // nejakej integer
            }
        }
    }

    private static void evaluateAssignment(final SimpleParser.AssignmentContext assignmentCtx,
                                           final Map<String, Symbol<Function>> globalSymbolTable,
                                           final Function currentScope) {
        if (assignmentCtx.Identifier() != null) {
            // assignment into a variable
            final Token identifier = assignmentCtx.Identifier().getSymbol();
            final Symbol<StackRecord> stackRecordSymbol = currentScope.getSymbol(identifier.getText())
                    .orElseThrow(() -> new AnalysisException(identifier, "Variable with name " + identifier.getText() + " not found"));

            // TODO check data type and size
        }
        // array index assignment

    }
}
