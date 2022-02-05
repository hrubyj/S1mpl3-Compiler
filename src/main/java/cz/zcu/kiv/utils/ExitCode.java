package cz.zcu.kiv.utils;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 05.02.22
 */
public enum ExitCode {
    NOT_ENOUGH_PARAMS(1),
    INVALID_ARGUMENT(2),
    COMPILATION_ERROR(3);

    private final int value;

    ExitCode(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
