package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;

import java.io.IOException;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 06.02.22
 */
public interface IFactory {

    SimpleParser createParser(String sourceFile) throws IOException;
}
