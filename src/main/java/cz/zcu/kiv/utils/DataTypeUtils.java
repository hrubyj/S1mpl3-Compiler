package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.lang.datatype.DataType;
import cz.zcu.kiv.simple.lang.datatype.impl.Array;
import cz.zcu.kiv.simple.lang.datatype.impl.Integer;
import cz.zcu.kiv.simple.lang.datatype.impl.Void;

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

    public static boolean returnsDataType(final SimpleParser.ReturnStatementContext returnStatement,
                                          final DataType dataType) {
        assertNotNull(returnStatement, "Return statement may not be null");
        assertNotNull(dataType, "Referential data type may not be null");

        return false;
    }

    private static boolean returnsArray(final SimpleParser.FunctionReturnTypeContext context) {
        return context.baseTypeSpecifier() == null;
    }
}
