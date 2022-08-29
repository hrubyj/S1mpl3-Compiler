package cz.zcu.kiv.simple.lang.impl;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.utils.pl0.PL0OutputStreamWriter;

import java.util.Map;

@FunctionalInterface
public interface FunctionEvaluator {

    void evaluateCall(SimpleParser.FunctionCallContext context, Symbol<StackRecord> leftSideSymbol,
                      Map<String, Symbol<Function>> globalSymbolTable,
                      PL0OutputStreamWriter writer,
                      Function currentScope);
}
