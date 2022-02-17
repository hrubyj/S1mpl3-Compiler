package cz.zcu.kiv.simple.symbol.lang;

import cz.zcu.kiv.simple.symbol.Symbol;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 17.02.22
 */
public class Function {

    private final Map<String, Symbol<Function>> scopeSymbolTable = new HashMap<>();

}
