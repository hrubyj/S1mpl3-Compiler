package cz.zcu.kiv.simple.lang.datatype.impl;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.lang.datatype.DataType;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class Void implements DataType {

    @Override
    public boolean isSameDataType(final SimpleParser.ExpressionContext expression) {
        assertNotNull(expression, "Expression may not be null");
        return expression.isEmpty() || expression.assignment() != null;
    }

    @Override
    public boolean returnsSameDataType(final SimpleParser.ReturnStatementContext returnStatement) {
        assertNotNull(returnStatement, "Return statement may not be null");

        final var expression = returnStatement.expression();
        return expression == null || expression.isEmpty() || expression.assignment() != null;
    }
}
