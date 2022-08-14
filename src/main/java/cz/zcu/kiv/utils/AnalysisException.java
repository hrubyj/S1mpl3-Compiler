package cz.zcu.kiv.utils;

import org.antlr.v4.runtime.Token;

public class AnalysisException extends RuntimeException {

    private final int lineNumber;
    private final int startIndex;
    private final String cause;

    public AnalysisException(final Token token, final String cause) {
        this(token.getLine(), token.getCharPositionInLine(), cause);
    }

    public AnalysisException(final int lineNumber, final int startIndex, final String cause) {
        this.lineNumber = lineNumber;
        this.startIndex = startIndex;
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return lineNumber + ":" + startIndex + " " + cause;
    }
}
