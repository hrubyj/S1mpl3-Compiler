package cz.zcu.kiv.antlr.impl;

import cz.zcu.kiv.utils.ExitCode;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListenerImpl extends BaseErrorListener {

    @Override
    public void syntaxError(final Recognizer<?, ?> recognizer,
                            final Object offendingSymbol,
                            final int lineNumber,
                            final int charPositionInLine,
                            final String message,
                            final RecognitionException exception) {
        final String errorMessage = "Syntax error:\n\t" +
                lineNumber + ':' + charPositionInLine + ": " + message + '\n';
        System.out.println(errorMessage);
        System.exit(ExitCode.COMPILATION_ERROR.getValue());
    }

}
