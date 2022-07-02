package cz.zcu.kiv.simple.lang.datatype;

import cz.zcu.kiv.gen.SimpleParser;

public interface ReturnValueDataType {

    String getName();

    boolean isSameDataType(SimpleParser.ExpressionContext expression);
}
