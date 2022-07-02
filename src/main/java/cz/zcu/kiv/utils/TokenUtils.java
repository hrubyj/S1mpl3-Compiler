package cz.zcu.kiv.utils;

import org.antlr.v4.runtime.Token;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class TokenUtils {

    public static int getTokenEndPositionInLine(final Token token) {
        assertNotNull(token, "Token may not be null");

        final int tokenLength = token.getStopIndex() - token.getStartIndex();
        return token.getCharPositionInLine() + tokenLength;
    }
}
