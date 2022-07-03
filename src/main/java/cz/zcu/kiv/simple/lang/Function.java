package cz.zcu.kiv.simple.lang;

import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.datatype.DataType;

public interface Function {

    DataType getReturnType();

    void addSymbol(Symbol<StackRecord> symbol);
}
