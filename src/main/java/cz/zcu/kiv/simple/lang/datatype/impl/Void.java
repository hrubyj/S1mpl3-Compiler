package cz.zcu.kiv.simple.lang.datatype.impl;

import cz.zcu.kiv.simple.lang.datatype.DataType;

public class Void implements DataType {

    @Override
    public boolean isSameDataType(final DataType dataType) {
        if (dataType == null) {
            return false;
        }

        return dataType instanceof Void;
    }

    @Override
    public String toString() {
        return "Void";
    }
}
