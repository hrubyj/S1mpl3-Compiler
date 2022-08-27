package cz.zcu.kiv.utils;

public enum PL0Operation {
    LESS_THAN(10),
    ADD(2),
    NOT_EQUAL(9);

    private static final String INSTRUCTION_NAME = "OPR";
    private final int code;

    PL0Operation(final int code) {
        this.code = code;
    }

    public String getInstructionName() {
        return INSTRUCTION_NAME;
    }

    public int getCode() {
        return code;
    }
}
