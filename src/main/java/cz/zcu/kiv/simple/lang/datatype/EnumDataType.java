package cz.zcu.kiv.simple.lang.datatype;

import cz.zcu.kiv.gen.SimpleParser;

import java.util.function.Function;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public enum EnumDataType {
    INTEGRAL(EnumDataType::isIntegral),
    ARRAY(EnumDataType::isArray),
    VOID(EnumDataType::isVoid);

    private final Function<SimpleParser.ExpressionContext, Boolean> isSameDataType;

    EnumDataType(final Function<SimpleParser.ExpressionContext, Boolean> isSameDataType) {
        this.isSameDataType = isSameDataType;
    }

    public static EnumDataType getValueFromFunctionReturnType(final SimpleParser.FunctionReturnTypeContext context) {
        if (context == null) {
            return null;
        }

        if (context.baseTypeSpecifier() == null) {
            return ARRAY;
        }

        return context.baseTypeSpecifier().Void() == null ? INTEGRAL : VOID;
    }

    public boolean isSameDataType(final SimpleParser.ExpressionContext expression) {
        return isSameDataType.apply(expression);
    }

    private static boolean isIntegral(final SimpleParser.ExpressionContext expression) {
        assertNotNull(expression, "Expression may not be null");

        if (expression.BooleanLiteral() != null || expression.signedConstant() != null) {
            return true;
        }

        return false;
    }

    private static boolean isVoid(final SimpleParser.ExpressionContext expression) {
        return false;
    }

    private static boolean isArray(final SimpleParser.ExpressionContext expression) {
        return false;
    }
}

