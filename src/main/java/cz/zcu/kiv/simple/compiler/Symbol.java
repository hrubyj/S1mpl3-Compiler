package cz.zcu.kiv.simple.compiler;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 17.02.22
 */
public class Symbol<T> {

    private final String name;
    private final T describedConstruction;

    public Symbol(final String name, final T describedConstruction) {
        if (name == null || name.isBlank() || describedConstruction == null) {
            throw new IllegalArgumentException("Symbol has to have a name and describe a non-null construction");
        }

        this.name = name;
        this.describedConstruction = describedConstruction;
    }

    public String getName() {
        return name;
    }

    public T getDescribedConstruction() {
        return describedConstruction;
    }
}
