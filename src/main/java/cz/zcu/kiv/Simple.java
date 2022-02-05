package cz.zcu.kiv;

import cz.zcu.kiv.gen.SimpleLexer;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.utils.ExitCode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 05.02.22
 */
public class Simple {

    public static final int EXPECTED_ARGUMENT_COUNT = 2;

    public static void main(String[] args) {
        validateArguments(args);

        try {
            compileSourceFile(args[0], args[1]);
        } catch (final IOException e) {
            System.out.format("Compilation error:\n" +
                    "\t%s", e.getMessage());
            System.exit(ExitCode.COMPILATION_ERROR.getValue());
        }
    }

    private static void compileSourceFile(final String sourceFile,
                                          final String outputFile) throws IOException {
        final CharStream inputStream = CharStreams.fromFileName(sourceFile);
        SimpleLexer lexer = new SimpleLexer(inputStream);
        CommonTokenStream token_stream = new CommonTokenStream(lexer);
        SimpleParser parser = new SimpleParser(token_stream);

    }

    private static void validateArguments(final String[] args) {
        validateArgumentCount(args);
        validateInputFile(args);
        validateOutputFile(args);
    }

    private static void validateOutputFile(final String[] args) {
        final String outputFile = args[1];
        if (isDirectory(outputFile)) {
            System.out.format("Output file '%s' is a directory. Please provide valid path to a non-directory file.", outputFile);
            System.exit(ExitCode.INVALID_ARGUMENT.getValue());
        }
    }

    private static void validateInputFile(final String[] args) {
        final String inputFile = args[0];
        if (!fileExists(inputFile)) {
            System.out.format("Input file '%s' does not exist. Please provide valid path to an existing S1mpl3 source file.\n", inputFile);
            System.exit(ExitCode.INVALID_ARGUMENT.getValue());
        }
    }

    private static void validateArgumentCount(String[] args) {
        if (args.length < EXPECTED_ARGUMENT_COUNT) {
            System.out.format("Not enough parameters passed\n" +
                    "Expected %d parameters:\n" +
                    "\tInput file path for compilation\n" +
                    "\tOutput file path for compiled program\n", EXPECTED_ARGUMENT_COUNT);
            System.exit(ExitCode.NOT_ENOUGH_PARAMS.getValue());
        }
    }

    private static boolean fileExists(final String path) {
        return new File(path).exists();
    }

    private static boolean isDirectory(final String path) {
        return new File(path).isDirectory();
    }
}
