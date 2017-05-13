package com.huang.interpreter;

/**
 * Created by hlp on 2017/4/18.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
