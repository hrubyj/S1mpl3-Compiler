package cz.zcu.kiv.simple.lang.datatype.impl;

import cz.zcu.kiv.simple.lang.datatype.DataType;
import cz.zcu.kiv.simple.lang.datatype.NonVoidDataType;

public class Integer extends NonVoidDataType {

    public Integer() {
        super(1);
    }

    @Override
    public boolean isSameDataType(final DataType dataType) {
        if (dataType == null) {
            return false;
        }

        return dataType instanceof Integer;
    }

    @Override
    public String toString() {
        return "Integer";
    }
}
