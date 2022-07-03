package cz.zcu.kiv.simple.lang.datatype;

import cz.zcu.kiv.gen.SimpleParser;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public abstract class NonVoidDataType implements DataType {

    private final int size;

    public NonVoidDataType(final int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean returnsSameDataType(final SimpleParser.ReturnStatementContext returnStatement) {
        assertNotNull(returnStatement, "Return statement may not be null");
        if (returnStatement.expression() == null) {
            return false;
        }

        return isSameDataType(returnStatement.expression());
    }
}
