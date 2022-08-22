package cz.zcu.kiv.simple.lang.datatype.impl;

import cz.zcu.kiv.simple.lang.datatype.DataType;
import cz.zcu.kiv.simple.lang.datatype.NonVoidDataType;

public class Array extends NonVoidDataType {

    public Array(final int size) {
        super(size);
    }

    @Override
    public boolean isSameDataType(final DataType dataType) {
        if (dataType == null) {
            return false;
        }

        return dataType instanceof Array array && array.getSize() == getSize();
    }

    @Override
    public String toString() {
        return "Array[" + getSize() + "]";
    }
}
