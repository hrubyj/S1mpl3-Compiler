package cz.zcu.kiv.utils;

public interface PL0OutputStreamWriter {

    void writeNextInstruction(String instruction, int level, int param);

    void writeReturn();

    void writeIncrementStackPointer(int amount);

    void updateInitialJump(int position);

    int getCurrentLineNumber();
}
