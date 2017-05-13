package com.huang.strategy;

/**
 * Created by hlp on 2017/4/18.
 */
public class Plus extends AbstractCalculator implements  ICalculator {
    @Override
    public int calculator(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
