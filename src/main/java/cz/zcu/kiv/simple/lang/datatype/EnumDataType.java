package cz.zcu.kiv.simple.lang.datatype;

import cz.zcu.kiv.gen.SimpleParser;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 18.02.22
 */
public enum EnumDataType {
    INTEGRAL,
    ARRAY,
    VOID;

    public static EnumDataType getValueFromFunctionReturnType(final SimpleParser.FunctionReturnTypeContext context) {
        if (context == null) {
            return null;
        }

        if (context.baseTypeSpecifier() == null) {
            return ARRAY;
        }

        return context.baseTypeSpecifier().Void() == null ? INTEGRAL : VOID;
    }
}
