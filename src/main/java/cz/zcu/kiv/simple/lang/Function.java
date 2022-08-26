package cz.zcu.kiv.simple.lang;

import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.datatype.DataType;

import java.util.Optional;

public interface Function {

    DataType getReturnType();

    void addSymbol(Symbol<StackRecord> symbol);

    Optional<Symbol<StackRecord>> getSymbol(String name);
}
