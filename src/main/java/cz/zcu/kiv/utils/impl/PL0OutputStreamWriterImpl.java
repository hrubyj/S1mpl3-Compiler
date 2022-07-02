package cz.zcu.kiv.utils.impl;

import cz.zcu.kiv.utils.PL0OutputStreamWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class PL0OutputStreamWriterImpl implements PL0OutputStreamWriter {

    private int currentLine = 0;
    private final RandomAccessFile outputFile;

    public PL0OutputStreamWriterImpl(final String file) {
        try {
            this.outputFile = new RandomAccessFile(file, "rw");
        } catch (final FileNotFoundException e) {
            throw new IllegalArgumentException("Illegal file name " + file, e);
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
        try {
            updateInstruction(0, "JMP", 0, position);
        } catch (final IOException e) {
            throw new IllegalStateException("Error while updating jump", e);
        }
    }

    @Override
    public int getCurrentLineNumber() {
        return this.currentLine;
    }

    @Override
    public void writeNextInstruction(final String instruction, final int level, final int param) {
        writeInstruction(currentLine, instruction, level, param);
        currentLine++;
    }

    private void writeInstruction(final int lineNumber, final String instruction, final int level, final int param) {
        try {
            outputFile.write((lineNumber + " " + instruction + " " + level + " " + param + '\n').getBytes());
        } catch (final IOException e) {
            throw new IllegalStateException("Error while writing instruction", e);
        }
    }

    private void updateInstruction(final int position, final String instruction, final int level, final int param) throws IOException {
        final long currentPosition = outputFile.getFilePointer();
        outputFile.seek(0);
        writeInstruction(position, instruction, level, param);
        outputFile.seek(currentPosition);
    }

}
