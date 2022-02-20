package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;
import org.antlr.v4.runtime.ANTLRErrorListener;

import java.io.IOException;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 06.02.22
 */
public interface IFactory {

    SimpleParser createParser(String sourceFile, ANTLRErrorListener errorListener) throws IOException;

    PL0OutputStreamWriter createOutputStreamWriter(String targetFile);
}
