package cz.zcu.kiv.antlr.impl;

import cz.zcu.kiv.gen.SimpleBaseListener;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.lang.EnumDataType;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.impl.CalledFunction;
import cz.zcu.kiv.simple.lang.impl.FunctionImpl;
import cz.zcu.kiv.simple.symbol.Symbol;
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

    private static final String MAIN_FUNCTION_NAME = "main";

    private final File outputFile;
    private final Map<String, Symbol<Function>> globalSymbolTable = new HashMap<>();
    private CalledFunction currentScope;
    private int currentLineNumber = 0;

    public SimpleListenerImpl(final String outputFile) {
        this.outputFile = new File(outputFile);
        if (this.outputFile.isDirectory()) {
            throw new IllegalArgumentException("Output must not be a directory");
        }
    }

    @Override
    public void enterProgram(final SimpleParser.ProgramContext ctx) {
        // TODO first line in the program has to be jump to the main function
        // we do not however know it's position yet, therefore we need to write stub first instruction like '0 JMP 0 X'
        // upon finishing compilation, this first line has to be overwritten by the correct position of the main function
    }

    @Override
    public void enterFunctionDeclaration(final SimpleParser.FunctionDeclarationContext context) {
        final String functionName = getUniqueFunctionName(context);

        final Function function = new FunctionImpl(EnumDataType.getValueFromFunctionReturnType(context.functionReturnType()));
        globalSymbolTable.put(functionName, new Symbol<>(functionName, function));

        // TODO generate PL/0 code to the output file
        // `currentLineNumber` INT 0 3
    }

    @Override
    public void enterMainFunctionDeclaration(final SimpleParser.MainFunctionDeclarationContext context) {
        globalSymbolTable.put(MAIN_FUNCTION_NAME, new Symbol<>(MAIN_FUNCTION_NAME, new FunctionImpl(EnumDataType.VOID)));
    }

    @Override
    public void enterFunctionDeclParam(final SimpleParser.FunctionDeclParamContext ctx) {
        super.enterFunctionDeclParam(ctx);
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


}
