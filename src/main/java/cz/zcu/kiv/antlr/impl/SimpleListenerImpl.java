package cz.zcu.kiv.antlr.impl;

import cz.zcu.kiv.gen.SimpleBaseListener;
import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.datatype.EnumDataType;
import cz.zcu.kiv.simple.lang.impl.CalledFunction;
import cz.zcu.kiv.simple.lang.impl.FunctionImpl;
import cz.zcu.kiv.utils.AnalysisException;
import cz.zcu.kiv.utils.ContextUtils;
import cz.zcu.kiv.utils.IFactory;
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
    public static final int DEFAULT_STACK_INCREMENT_AMOUNT = 3;

    private final Map<String, Symbol<Function>> globalSymbolTable = new HashMap<>();
    private CalledFunction currentScope;
    private int mainFunctionLineNumber;

    private final PL0OutputStreamWriter writer;
    private final IFactory factory;

    public SimpleListenerImpl(final PL0OutputStreamWriter writer, final IFactory factory) {
        validateDependencies(writer, factory);

        this.writer = writer;
        this.factory = factory;
    }

    private void validateDependencies(final PL0OutputStreamWriter writer, final IFactory factory) {
        if (writer == null) {
            throw new IllegalArgumentException("Output writer may not be null");
        }
        if (factory == null) {
            throw new IllegalArgumentException("Factory may not be null");
        }
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

        // TODO refactor
        int stackIncrementAmount = DEFAULT_STACK_INCREMENT_AMOUNT;
        if (context.functionDeclParams() != null) {
            for (final SimpleParser.FunctionDeclParamContext paramContext : context.functionDeclParams().functionDeclParam()) {
                if (paramContext.nonVoidTypeSpecifier() != null) {
                    final Symbol<StackRecord> integerStackRecordSymbol = factory.createIntegerStackRecordSymbol(ContextUtils.getParameterIdentifier(paramContext), stackIncrementAmount);
                    function.addSymbol(integerStackRecordSymbol);
                    stackIncrementAmount += integerStackRecordSymbol.getDescribedConstruction().getRecordSize();
                } else {
                    final int arraySize = ContextUtils.getArrayTypeParameterSize(paramContext.arrayTypeSpecifier());
                    final Symbol<StackRecord> arrayStackRecordSymbol = factory.createArrayStackRecordSymbol(ContextUtils.getParameterIdentifier(paramContext), stackIncrementAmount, arraySize);
                    function.addSymbol(arrayStackRecordSymbol);
                    stackIncrementAmount += arrayStackRecordSymbol.getDescribedConstruction().getRecordSize();
                }
            }
        }

        writer.writeIncrementStackPointer(stackIncrementAmount);
        globalSymbolTable.put(functionName, new Symbol<>(functionName, function));
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
