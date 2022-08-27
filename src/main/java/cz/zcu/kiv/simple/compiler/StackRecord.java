package cz.zcu.kiv.simple.compiler;

import cz.zcu.kiv.simple.lang.datatype.NonVoidDataType;

import java.util.Optional;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class StackRecord {

    private final int relativeStartIndex;
    private final NonVoidDataType dataType;
    private final boolean isConst;

    private Object value;

    public StackRecord(final int relativeIndex, final NonVoidDataType dataType, final Boolean isConst, final Object value) {
        assertNotNull(dataType, "Data type on stack may not be null");

        this.relativeStartIndex = relativeIndex;
        this.dataType = dataType;
        this.isConst = isConst != null && isConst;
        this.value = value;
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

    public Optional<Object> getValue() {
        return Optional.ofNullable(value);
    }

    public void setValue(final Object value) {
        this.value = value;
    }
}
