package cz.zcu.kiv.utils;

public class ValidationUtils {

    public static <T> void assertNotNull(final T object, final String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void assertNotEmpty(final String string, final String message) {
        if (string == null || string.isEmpty() || string.isBlank()) {
            throw new IllegalArgumentException(message);
        }
    }
}
