package cz.zcu.kiv.simple.lang.impl;

import java.util.Arrays;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public enum NativeFunction {
    SUM("+"),
    SUB("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    MOD("%"),
    LESS("<"),
    LESS_OR_EQUAL("<="),
    EQUAL("="),
    GREATER(">"),
    GREATER_OR_EQUAL(">="),
    AND("AND"),
    OR("OR"),
    NEGATE("!");

    private final String name;

    NativeFunction(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static boolean isNativeFunctionName(final String name) {
        assertNotNull(name, "Name may not be null");
        return Arrays.stream(NativeFunction.values()).anyMatch(function -> name.equals(function.getName()));
    }

    public static NativeFunction getNativeFunctionName(final String name) {
        assertNotNull(name, "Name may not be null");
        return Arrays.stream(NativeFunction.values())
                .filter(function -> name.equals(function.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Native function '" + name + "' not found"));
    }
}
