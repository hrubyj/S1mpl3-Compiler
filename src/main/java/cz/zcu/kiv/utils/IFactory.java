package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import org.antlr.v4.runtime.ANTLRErrorListener;

import java.io.IOException;

public interface IFactory {

    SimpleParser createParser(String sourceFile, ANTLRErrorListener errorListener) throws IOException;

    PL0OutputStreamWriter createOutputStreamWriter(String targetFile);

    Symbol<StackRecord> createIntegerStackRecordSymbol(final String identifier, final int stackIndex, final boolean isConst);

    Symbol<StackRecord> createArrayStackRecordSymbol(final String identifier, final int stackIndex, final int size);
}
