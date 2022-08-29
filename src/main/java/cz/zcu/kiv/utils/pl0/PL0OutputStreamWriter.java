package cz.zcu.kiv.utils.pl0;

public interface PL0OutputStreamWriter {

    void writeNextInstruction(String instruction, int level, int param);

    void writeReturn();

    void writeIncrementStackPointer(int amount);

    void updateInitialJump(int position);

    void updateInstruction(int position, String instruction, int level, int param);

    int getCurrentLineNumber();

    void writeReturnInstruction();

    void writePushToStack(int value);

    void writeLoadValueFromAddressOnStackTop(int relativeIndex);

    void writeStoreStackTopToAddress(int relativeIndex);

    void writeDoOperation(PL0Operation operation);

    void flush();
}
