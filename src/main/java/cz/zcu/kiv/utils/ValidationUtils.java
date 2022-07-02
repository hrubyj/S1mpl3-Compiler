package cz.zcu.kiv.utils;

public class ValidationUtils {

    public static <T> void assertNotNull(final T object, final String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }
}
