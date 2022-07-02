package cz.zcu.kiv.utils;

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
