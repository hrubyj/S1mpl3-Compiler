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
import org.antlr.v4.runtime.tree.TerminalNode;

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
}
