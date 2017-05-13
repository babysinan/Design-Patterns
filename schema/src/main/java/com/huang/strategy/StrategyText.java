package com.huang.strategy;

/**
 * Created by hlp on 2017/4/18.
 */
public class StrategyText {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculator(exp);
        System.out.println(result);
    }
}
