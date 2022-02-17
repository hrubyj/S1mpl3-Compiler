package cz.zcu.kiv.antlr.impl;

import cz.zcu.kiv.gen.SimpleBaseListener;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.symbol.Symbol;
import cz.zcu.kiv.simple.symbol.lang.Function;
import cz.zcu.kiv.utils.AnalysisException;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 06.02.22
 */
public class SimpleListenerImpl extends SimpleBaseListener {

    private final File outputFile;
    private final Map<String, Symbol<Function>> globalSymbolTable = new HashMap<>();
    private Function currentScope;

    public SimpleListenerImpl(final String outputFile) {
        this.outputFile = new File(outputFile);
        if (this.outputFile.isDirectory()) {
            throw new IllegalArgumentException("Output must not be a directory");
        }
    }

    @Override
    public void enterFunctionDeclaration(final SimpleParser.FunctionDeclarationContext context) {
        final String functionName = getUniqueFunctionName(context);

        final Function function = new Function();
        currentScope = function;
        globalSymbolTable.put(functionName, new Symbol<>(functionName, function));

        // TODO generate PL/0 code to the output file
    }

    private String getUniqueFunctionName(final SimpleParser.FunctionDeclarationContext context) {
        final Token symbol = context.Identifier().getSymbol();
        final String functionName = symbol.getText();
        if (globalSymbolTable.containsKey(functionName)) {
            throw new AnalysisException(symbol.getLine(), symbol.getStartIndex(),
                    "Repeated declaration of function '" + functionName + '\'');
        }

        return functionName;
    }

    @Override
    public void enterMainFunctionDeclaration(final SimpleParser.MainFunctionDeclarationContext context) {

    }
}
