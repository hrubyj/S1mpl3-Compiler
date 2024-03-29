package cz.zcu.kiv;

import cz.zcu.kiv.antlr.impl.ErrorListenerImpl;
import cz.zcu.kiv.antlr.impl.SimpleListenerImpl;
import cz.zcu.kiv.gen.SimpleListener;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.utils.ExitCode;
import cz.zcu.kiv.utils.IFactory;
import cz.zcu.kiv.utils.pl0.PL0OutputStreamWriter;
import cz.zcu.kiv.utils.impl.FactoryImpl;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;

public class Simple {

    public static final int EXPECTED_ARGUMENT_COUNT = 2;

    private static final IFactory factory = new FactoryImpl();

    public static void main(String[] args) {
        validateArguments(args);

        try {
            compileSourceFile(args[0], args[1]);
        } catch (final Exception e) {
            System.out.format("Compilation error:\n" +
                    "\t%s\n", e.getMessage());
            System.exit(ExitCode.COMPILATION_ERROR.getValue());
        }
    }

    private static void compileSourceFile(final String sourceFile,
                                          final String outputFile) throws IOException {
        final SimpleParser parser = factory.createParser(sourceFile, new ErrorListenerImpl());
        final ParseTreeWalker walker = new ParseTreeWalker();

        final PL0OutputStreamWriter writer = factory.createOutputStreamWriter(outputFile);
        final SimpleListener listener = new SimpleListenerImpl(writer, factory);

        final ParseTree tree = parser.program();
        walker.walk(listener, tree);
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
