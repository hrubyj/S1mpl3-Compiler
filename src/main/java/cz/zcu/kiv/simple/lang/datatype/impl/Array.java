package cz.zcu.kiv.simple.lang.datatype.impl;

import cz.zcu.kiv.gen.SimpleParser;
import cz.zcu.kiv.simple.lang.datatype.NonVoidDataType;

import static cz.zcu.kiv.utils.ValidationUtils.assertNotNull;

public class Array extends NonVoidDataType {

    public Array(final int size) {
        super(size);
    }

    @Override
    public boolean isSameDataType(final SimpleParser.ExpressionContext expression) {
        assertNotNull(expression, "Expression may not be null");

        // array can only be returned from conditional expression
        if (expression.conditionalExpression() == null) {
            return false;
        }

        final var condExpression = expression.conditionalExpression();
        if (condExpression.Colon() == null) {
            final var _expression = condExpression.nonVoidReturnValue();
            if (_expression.functionCall() == null && _expression.Identifier() == null) {
                return false;
            }

            if (_expression.functionCall() != null) {
//                if (_expression.functionCall().)
                //TODO function call
            }

            //TODO is identifier for an array?
        }

        //TODO entire conditional expression

        return false;
    }
}
