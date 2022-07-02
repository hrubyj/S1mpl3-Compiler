package cz.zcu.kiv.simple.compiler;

import cz.zcu.kiv.simple.lang.datatype.NonVoidDataType;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class StackRecord {

    private final int relativeStartIndex;
    private final NonVoidDataType dataType;

    public StackRecord(final int relativeIndex, final NonVoidDataType dataType) {
        assertNotNull(dataType, "Data type on stack may not be null");

        this.relativeStartIndex = relativeIndex;
        this.dataType = dataType;
    }

    public int getRelativeStartIndex() {
        return relativeStartIndex;
    }

    public int getRecordSize() {
        return dataType.getSize();
    }
}
