package cz.zcu.kiv.utils;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.compiler.StackRecord;
import cz.zcu.kiv.simple.compiler.Symbol;
import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.datatype.DataType;
import cz.zcu.kiv.simple.lang.datatype.impl.Array;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Map;
import java.util.Stack;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class EvaluationUtils {

    public static void evaluateExpression(final SimpleParser.ExpressionContext expressionCtx,
                                          final Map<String, Symbol<Function>> globalSymbolTable,
                                          final PL0OutputStreamWriter writer,
                                          final Function currentScope) {
        assertNotNull(expressionCtx, "Expression context may not be null");
        assertNotNull(globalSymbolTable, "Global symbol table may not be null");
        assertNotNull(writer, "Output stream writer may not be null");
        assertNotNull(currentScope, "Current scope may not be null");

        final Stack<SimpleParser.ExpressionContext> expressionContexts = new Stack<>();
        expressionContexts.push(expressionCtx);
        while (!expressionContexts.isEmpty()) {
            final var topExpressionContext = expressionContexts.pop();
            if (topExpressionContext == null) {
                throw new NullPointerException("Expression context is null");
            }

            if (topExpressionContext.conditionalExpression() == null) {
                if (topExpressionContext.assignment() != null) {
                    // assignment
                    evaluateAssignment(topExpressionContext.assignment(), globalSymbolTable, writer, currentScope);
                }
                // nejakej integer
            }
        }
    }

    private static void evaluateAssignment(final SimpleParser.AssignmentContext assignmentCtx,
                                           final Map<String, Symbol<Function>> globalSymbolTable,
                                           final PL0OutputStreamWriter writer,
                                           final Function currentScope) {
        if (assignmentCtx.Identifier() != null) {
            evaluateVariableAssignment(assignmentCtx.Identifier(), globalSymbolTable, writer, currentScope);
            return;
        }

        evaluateArrayIndexAssignment(assignmentCtx.arrayAccess(), globalSymbolTable, writer, currentScope);
    }

    private static void evaluateVariableAssignment(final TerminalNode identifier,
                                                   final Map<String, Symbol<Function>> globalSymbolTable,
                                                   final PL0OutputStreamWriter writer,
                                                   final Function currentScope) {
        // assignment into a variable
        final Token identifierToken = identifier.getSymbol();
        final Symbol<StackRecord> stackRecordSymbol = currentScope.getSymbol(identifier.getText())
                .orElseThrow(() -> new AnalysisException(identifierToken, "Variable with name " + identifier.getText() + " not found"));
        // TODO check data type and size

    }

    private static void evaluateArrayIndexAssignment(final SimpleParser.ArrayAccessContext arrayAccessCtx,
                                                     final Map<String, Symbol<Function>> globalSymbolTable,
                                                     final PL0OutputStreamWriter writer,
                                                     final Function currentScope) {
        final DataType assignedType = DataTypeUtils.getConditionalExpressionReturnValueType(arrayAccessCtx.conditionalExpression(), globalSymbolTable, currentScope);
        if (assignedType instanceof Array) {
            throw new AnalysisException(arrayAccessCtx.getStart(),
                    "Attempting to assign an array into an array index. Only integers and booleans permitted");
        }

        final Token identifier = arrayAccessCtx.Identifier().getSymbol();
        final Symbol<StackRecord> stackRecordSymbol = currentScope.getSymbol(identifier.getText())
                .orElseThrow(() -> new AnalysisException(identifier, "Variable with name " + identifier.getText() + " not found"));

        final DataType arrayIndexResultType = DataTypeUtils.getConditionalExpressionReturnValueType(arrayAccessCtx.conditionalExpression(), globalSymbolTable, currentScope);
        if (arrayIndexResultType instanceof Array) {
            throw new AnalysisException(arrayAccessCtx.LeftBracket().getSymbol(), "Array index has to be an integer, got Array");
        }

        // array index assignment
    }
}
