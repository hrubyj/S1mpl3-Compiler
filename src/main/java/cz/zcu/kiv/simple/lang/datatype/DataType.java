package cz.zcu.kiv.simple.lang.datatype;

import cz.zcu.kiv.gen.SimpleParser;

public interface DataType {

    boolean isSameDataType(SimpleParser.ExpressionContext expression);

    boolean returnsSameDataType(SimpleParser.ReturnStatementContext returnStatement);
}
