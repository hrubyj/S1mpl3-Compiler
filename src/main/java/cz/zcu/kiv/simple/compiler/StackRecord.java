package cz.zcu.kiv.simple.compiler;

import cz.zcu.kiv.simple.lang.datatype.NonVoidDataType;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 23.02.22
 */
public class StackRecord {

    private final int relativeStartIndex;
    private final NonVoidDataType dataType;

    public StackRecord(final int relativeIndex, final NonVoidDataType dataType) {
        if (dataType == null) {
            throw new IllegalArgumentException("Data type on stack may not be null");
        }

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
