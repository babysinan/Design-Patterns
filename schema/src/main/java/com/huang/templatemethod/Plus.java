package com.huang.templatemethod;

/**
 * Created by hlp on 2017/4/18.
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
