package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 23.02.22
 */
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

        return Integer.parseInt(context.NonzeroConstant().getSymbol().getText());
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
}
