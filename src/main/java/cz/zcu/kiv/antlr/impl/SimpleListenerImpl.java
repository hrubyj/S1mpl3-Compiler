package cz.zcu.kiv.antlr.impl;

import cz.zcu.kiv.gen.SimpleBaseListener;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.lang.EnumDataType;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.impl.CalledFunction;
import cz.zcu.kiv.simple.lang.impl.FunctionImpl;
import cz.zcu.kiv.simple.symbol.Symbol;
import cz.zcu.kiv.utils.AnalysisException;
import cz.zcu.kiv.utils.PL0OutputStreamWriter;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 06.02.22
 */
public class SimpleListenerImpl extends SimpleBaseListener {

    private static final String MAIN_FUNCTION_NAME = "main";

    private final Map<String, Symbol<Function>> globalSymbolTable = new HashMap<>();
    private CalledFunction currentScope;
    private int mainFunctionLineNumber;

    private final PL0OutputStreamWriter writer;

    public SimpleListenerImpl(final PL0OutputStreamWriter writer) {
        if (writer == null) {
            throw new IllegalArgumentException("Output writer may not be null");
        }

        this.writer = writer;
    }

    @Override
    public void enterProgram(final SimpleParser.ProgramContext ctx) {
        // first line in the program has to be jump to the main function
        // we do not however know it's position yet, therefore we need to write stub first instruction like '0 JMP 0 X'
        // upon finishing compilation, this first line has to be overwritten by the correct position of the main function
        writer.writeNextInstruction("JMP", 0, 0);
    }

    @Override
    public void enterFunctionDeclaration(final SimpleParser.FunctionDeclarationContext context) {
        final String functionName = getUniqueFunctionName(context);

        final Function function = new FunctionImpl(EnumDataType.getValueFromFunctionReturnType(context.functionReturnType()));
        globalSymbolTable.put(functionName, new Symbol<>(functionName, function));
        writer.writeNextInstruction("INT", 0, 3);
    }

    @Override
    public void enterMainFunctionDeclaration(final SimpleParser.MainFunctionDeclarationContext context) {
        globalSymbolTable.put(MAIN_FUNCTION_NAME, new Symbol<>(MAIN_FUNCTION_NAME, new FunctionImpl(EnumDataType.VOID)));
        mainFunctionLineNumber = writer.getCurrentLineNumber();
    }

    @Override
    public void exitMainFunctionDeclaration(final SimpleParser.MainFunctionDeclarationContext ctx) {
        // main is always the last function - when we finish its compilation, we may update the initial jump to its position
        writer.updateInitialJump(mainFunctionLineNumber);
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
