package com.huang.state;

/**
 * Created by hlp on 2017/4/18.
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public void method1(){
        System.out.println("the first opt...");
    }
    public void method2(){
        System.out.println("the second opt...");
    }
}
