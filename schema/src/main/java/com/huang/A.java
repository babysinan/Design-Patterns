package com.huang;

/**
 * Created by hlp on 2017/4/19.
 */
public class A {
    {
        System.out.println("this is the non-static");
    }
    static {
        System.out.println("this is the static ....");
    }

    public A() {
        System.out.println("constractor A...");
    }
}
