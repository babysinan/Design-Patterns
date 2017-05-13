package com.huang.adapter.classdapter;

/**
 * Created by hlp on 2017/4/14.
 */
public class Test {
    public static void main(String[] args) {
        Targetable targetable=new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
