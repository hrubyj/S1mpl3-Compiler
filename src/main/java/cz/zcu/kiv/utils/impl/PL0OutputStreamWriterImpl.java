package cz.zcu.kiv.utils.impl;

import cz.zcu.kiv.utils.pl0.PL0Instruction;
import cz.zcu.kiv.utils.pl0.PL0Operation;
import cz.zcu.kiv.utils.pl0.PL0OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class PL0OutputStreamWriterImpl implements PL0OutputStreamWriter {

    private final List<PL0Instruction> instructions = new ArrayList<>();
    private int currentLine = 0;
    private final String outputFileName;

    public PL0OutputStreamWriterImpl(final String file) {
        try {
            final var outputFile = new FileOutputStream(file);
            outputFile.close();
            outputFileName = file;
        } catch (final FileNotFoundException e) {
            throw new IllegalArgumentException("Illegal file name " + file, e);
        } catch (IOException e) {
            throw new RuntimeException("Error while closing output file", e);
        }
    }


    @Override
    public void flush() {
        try (final var outputFile = new FileOutputStream(outputFileName)) {
            for (final var instruction : instructions) {
                outputFile.write(instruction.getBytes());
            }
        } catch (final FileNotFoundException e) {
            throw new IllegalArgumentException("Illegal file name " + outputFileName, e);
        } catch (IOException e) {
            throw new RuntimeException("Error while closing or writing into output file", e);
        }
    }

    @Override
    public void writeReturn() {
        writeNextInstruction("RET", 0, 0);
    }

    @Override
    public void writeIncrementStackPointer(final int amount) {
        writeNextInstruction("INT", 0, amount);
    }

    @Override
    public void updateInitialJump(final int position) {
        updateInstruction(0, "JMP", 0, position);
    }

    @Override
    public void updateInstruction(final int position, final String instruction, final int level, final int param) {
        // we have an array list therefore index access is in constant time so this is not a burden
        instructions.set(position, new PL0Instruction(position, instruction, level, param));
    }

    @Override
    public int getCurrentLineNumber() {
        return this.currentLine;
    }

    @Override
    public void writeReturnInstruction() {
        writeNextInstruction("RET", 0, 0);
    }

    @Override
    public void writePushToStack(final int value) {
        writeNextInstruction("LIT", 0, value);
    }

    @Override
    public void writeLoadValueFromAddressOnStackTop(final int relativeIndex) {
        writeNextInstruction("LOD", 0, relativeIndex);
    }

    @Override
    public void writeStoreStackTopToAddress(final int relativeIndex) {
        writeNextInstruction("STO", 0, relativeIndex);
    }

    @Override
    public void writeDoOperation(final PL0Operation operation) {
        assertNotNull(operation, "Operation may not be null");
        writeNextInstruction(operation.getInstructionName(), 0, operation.getCode());
    }

    @Override
    public void writeNextInstruction(final String instruction, final int level, final int param) {
        writeInstruction(currentLine, instruction, level, param);
        currentLine++;
    }

    private void writeInstruction(final int lineNumber, final String instruction, final int level, final int param) {
        instructions.add(new PL0Instruction(lineNumber, instruction, level, param));
    }

}
