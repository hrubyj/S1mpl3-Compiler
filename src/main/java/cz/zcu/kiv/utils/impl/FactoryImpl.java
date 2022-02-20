package cz.zcu.kiv.utils.impl;

import cz.zcu.kiv.gen.SimpleLexer;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.utils.IFactory;
import cz.zcu.kiv.utils.PL0OutputStreamWriter;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 06.02.22
 */
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
}
