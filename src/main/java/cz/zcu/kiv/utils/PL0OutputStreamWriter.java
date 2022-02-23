package cz.zcu.kiv.utils;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 20.02.22
 */
public interface PL0OutputStreamWriter {

    void writeNextInstruction(String instruction, int level, int param);

    void writeReturn();

    void writeIncrementStackPointer(int amount);

    void updateInitialJump(int position);

    int getCurrentLineNumber();
}
