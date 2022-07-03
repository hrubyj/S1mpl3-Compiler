package cz.zcu.kiv.simple.lang.impl;

import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.datatype.DataType;

import java.util.HashMap;
import java.util.Map;

public class FunctionImpl implements Function {

    private final DataType returnType;
    private final Map<String, Symbol<StackRecord>> scopeSymbolTable = new HashMap<>();

    public FunctionImpl(final DataType returnType) {
        this.returnType = returnType;
    }

    @Override
    public DataType getReturnType() {
        return returnType;
    }

    @Override
    public void addSymbol(final Symbol<StackRecord> symbol) {
        if (symbol == null) {
            return;
        }

        scopeSymbolTable.put(symbol.getName(), symbol);
    }

}
