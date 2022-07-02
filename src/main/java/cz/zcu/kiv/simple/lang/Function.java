package cz.zcu.kiv.simple.lang;

import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.datatype.EnumDataType;

public interface Function {

    EnumDataType getReturnType();

    void addSymbol(Symbol<StackRecord> symbol);
}
