package cz.zcu.kiv.utils;

public record PL0Instruction(
        int lineNumber,
        String name,
        int level,
        int param
) {

    @Override
    public String toString() {
        return lineNumber + " " + name + " " + level + " " + param + '\n';
    }

    public byte[] getBytes() {
        return toString().getBytes();
    }
}
