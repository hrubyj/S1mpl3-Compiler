package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import org.antlr.v4.runtime.ANTLRErrorListener;

import java.io.IOException;

public interface IFactory {

    SimpleParser createParser(String sourceFile, ANTLRErrorListener errorListener) throws IOException;

    PL0OutputStreamWriter createOutputStreamWriter(String targetFile);

    Symbol<StackRecord> createIntegerStackRecordSymbol(String identifier, int stackIndex, boolean isConst, Object value);

    Symbol<StackRecord> createArrayStackRecordSymbol(String identifier, int stackIndex, int size, Object value);
}
