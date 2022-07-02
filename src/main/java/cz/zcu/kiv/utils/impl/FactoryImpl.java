package cz.zcu.kiv.utils.impl;

import cz.zcu.kiv.gen.SimpleLexer;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.datatype.impl.Array;
import cz.zcu.kiv.simple.lang.datatype.impl.Integer;
import cz.zcu.kiv.utils.IFactory;
import cz.zcu.kiv.utils.PL0OutputStreamWriter;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class FactoryImpl implements IFactory {

    @Override
    public SimpleParser createParser(final String sourceFile, final ANTLRErrorListener errorListener) throws IOException {
        final SimpleParser parser = constructParser(sourceFile);
        if (errorListener != null) {
            parser.addErrorListener(errorListener);
        }

        return parser;
    }

    private SimpleParser constructParser(final String sourceFile) throws IOException {
        final CharStream inputStream = CharStreams.fromFileName(sourceFile);
        SimpleLexer lexer = new SimpleLexer(inputStream);
        CommonTokenStream token_stream = new CommonTokenStream(lexer);
        return new SimpleParser(token_stream);
    }

    @Override
    public PL0OutputStreamWriter createOutputStreamWriter(final String targetFile) {
        return new PL0OutputStreamWriterImpl(targetFile);
    }

    @Override
    public Symbol<StackRecord> createIntegerStackRecordSymbol(final String identifier,
                                                              final int stackIndex) {
        final Integer integer = new Integer();
        return new Symbol<>(identifier, new StackRecord(stackIndex, integer));
    }

    @Override
    public Symbol<StackRecord> createArrayStackRecordSymbol(final String identifier,
                                                            final int stackIndex,
                                                            final int size) {
        final Array array = new Array(size);
        return new Symbol<>(identifier, new StackRecord(stackIndex, array));
    }
}
