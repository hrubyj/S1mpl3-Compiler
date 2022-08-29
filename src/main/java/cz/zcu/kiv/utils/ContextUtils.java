package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;

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

    public static boolean isTernaryOperator(final SimpleParser.ConditionalExpressionContext context) {
        if (context == null) {
            return false;
        }

        return context.Colon() != null;
    }

    public static boolean isFunctionCall(final SimpleParser.NonVoidReturnValueContext context) {
        if (context == null) {
            return false;
        }

        return context.functionCall() != null;
    }

    public static boolean isBooleanLiteral(final SimpleParser.NonVoidReturnValueContext context) {
        if (context == null) {
            return false;
        }

        return context.BooleanLiteral() != null;
    }

    public static boolean isBooleanLiteral(final SimpleParser.ExpressionContext context) {
        if (context == null) {
            return false;
        }

        return context.BooleanLiteral() != null ||
                (context.conditionalExpression() != null && isBooleanLiteral(context.conditionalExpression().nonVoidReturnValue()));
    }

    public static boolean isSignedConstant(final SimpleParser.NonVoidReturnValueContext context) {
        if (context == null) {
            return false;
        }

        return context.signedConstant() != null;
    }

    public static boolean isSignedConstant(final SimpleParser.ExpressionContext context) {
        if (context == null) {
            return false;
        }

        return context.signedConstant() != null ||
                (context.conditionalExpression() != null && isSignedConstant(context.conditionalExpression().nonVoidReturnValue()));
    }

    public static boolean isArrayAccess(final SimpleParser.NonVoidReturnValueContext context) {
        if (context == null) {
            return false;
        }

        return context.arrayAccess() != null;
    }

    public static boolean isArrayAccess(final SimpleParser.AssignmentContext context) {
        if (context == null) {
            return false;
        }

        return context.arrayAccess() != null;
    }

    public static boolean isIdentifierReference(final SimpleParser.NonVoidReturnValueContext context) {
        if (context == null) {
            return false;
        }

        return context.Identifier() != null;
    }

    public static boolean isIfStatement(final SimpleParser.SelectionStatementContext context) {
        if (context == null) {
            return false;
        }

        return context.If() != null;
    }
}
