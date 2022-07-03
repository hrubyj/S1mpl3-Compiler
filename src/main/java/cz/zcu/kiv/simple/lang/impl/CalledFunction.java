package cz.zcu.kiv.simple.lang.impl;

import cz.zcu.kiv.simple.lang.Function;
import cz.zcu.kiv.simple.lang.datatype.DataType;

public class CalledFunction {

    private CalledFunction caller;
    private Function state;

    public CalledFunction(final CalledFunction caller, final Function state) {
        this.caller = caller;
        this.state = state;
    }

    public CalledFunction getCaller() {
        return caller;
    }

    public DataType getReturnType() {
        return state.getReturnType();
    }

}
