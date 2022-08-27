package cz.zcu.kiv.simple.lang.impl;

import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.datatype.DataType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FunctionImpl implements Function {

    private static final int DEFAULT_STACK_TOP_INDEX = 2;

    private final DataType returnType;
    private final Map<String, Symbol<StackRecord>> scopeSymbolTable = new HashMap<>();

    private int stackTopIndex;

    public FunctionImpl(final DataType returnType) {
        this(returnType, DEFAULT_STACK_TOP_INDEX);
    }

    public FunctionImpl(final DataType returnType, final int stackTopIndex) {
        this.returnType = returnType;
        this.stackTopIndex = stackTopIndex;
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
        incrementStackTopIndex(symbol.getDescribedConstruction().getRecordSize());
    }

    @Override
    public Optional<Symbol<StackRecord>> getSymbol(final String name) {
        if (name == null) {
            return Optional.empty();
        }


        return Optional.ofNullable(scopeSymbolTable.getOrDefault(name, null));
    }

    @Override
    public int getStackTopIndex() {
        return this.stackTopIndex;
    }

    @Override
    public int getAvailableStackIndex() {
        return this.stackTopIndex + 1;
    }

    //    @Override
    /*public*/
    private void incrementStackTopIndex(final int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Stack increment amount has to be a positive integer");
        }

        this.stackTopIndex += amount;
    }
}
