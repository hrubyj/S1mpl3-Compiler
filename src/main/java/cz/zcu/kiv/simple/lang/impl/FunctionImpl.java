package cz.zcu.kiv.simple.lang.impl;

import cz.zcu.kiv.simple.lang.EnumDataType;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.symbol.Symbol;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 17.02.22
 */
public class FunctionImpl implements Function {

    private EnumDataType returnType;
    private final Map<String, Symbol<FunctionImpl>> scopeSymbolTable = new HashMap<>(); // TODO change type of symbol to variable

    public FunctionImpl(final EnumDataType returnType) {
        this.returnType = returnType;
    }

    @Override
    public EnumDataType getReturnType() {
        return returnType;
    }

    public Map<String, Symbol<FunctionImpl>> getScopeSymbolTable() {
        return scopeSymbolTable;
    }
}
