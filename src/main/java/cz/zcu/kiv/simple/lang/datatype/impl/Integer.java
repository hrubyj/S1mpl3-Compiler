package cz.zcu.kiv.simple.lang.datatype.impl;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.lang.datatype.NonVoidDataType;

public class Integer extends NonVoidDataType {

    public Integer() {
        super(1);
    }

    @Override
    public boolean isSameDataType(final SimpleParser.ExpressionContext expression) {
        return false;
    }

}
