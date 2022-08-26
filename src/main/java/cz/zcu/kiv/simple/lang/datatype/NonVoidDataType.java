package cz.zcu.kiv.simple.lang.datatype;

public abstract class NonVoidDataType implements DataType {

    private final int size;

    public NonVoidDataType(final int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}
