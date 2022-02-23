package cz.zcu.kiv.simple.lang.datatype;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 23.02.22
 */
public class NonVoidDataType {

    private final int size;

    public NonVoidDataType(final int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
