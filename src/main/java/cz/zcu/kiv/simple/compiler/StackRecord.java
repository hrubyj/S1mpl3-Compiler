package cz.zcu.kiv.simple.compiler;

import cz.zcu.kiv.simple.lang.datatype.NonVoidDataType;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class StackRecord {

    private final int relativeStartIndex;
    private final NonVoidDataType dataType;

    private final boolean isConst;

    public StackRecord(final int relativeIndex, final NonVoidDataType dataType, final Boolean isConst) {
        assertNotNull(dataType, "Data type on stack may not be null");

        this.relativeStartIndex = relativeIndex;
        this.dataType = dataType;
        this.isConst = isConst != null && isConst;
    }

    public int getRelativeStartIndex() {
        return relativeStartIndex;
    }

    public int getRecordSize() {
        return dataType.getSize();
    }

    public NonVoidDataType getDataType() {
        return dataType;
    }
}
