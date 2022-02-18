package cz.zcu.kiv.simple.lang.impl;

import cz.zcu.kiv.simple.lang.EnumDataType;
import cz.zcu.kiv.simple.lang.Function;

/**
 * @author <a href="mailto:">David Markov</a>
 * @since 18.02.22
 */
public class CalledFunction implements Function {

    private CalledFunction caller;
    private Function state;

    public CalledFunction(final CalledFunction caller, final Function state) {
        this.caller = caller;
        this.state = state;
    }

    public CalledFunction getCaller() {
        return caller;
    }

    @Override
    public EnumDataType getReturnType() {
        return state.getReturnType();
    }
}
