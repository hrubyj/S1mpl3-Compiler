package cz.zcu.kiv.utils;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 17.02.22
 */
public class AnalysisException extends RuntimeException {

    private final int lineNumber;
    private final int startIndex;
    private final String cause;

    public AnalysisException(final int lineNumber, final int startIndex, final String cause) {
        this.lineNumber = lineNumber;
        this.startIndex = startIndex;
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return lineNumber + ':' + startIndex + cause;
    }
}
