package com.huang.decorator;

/**
 * Created by hlp on 2017/4/14.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("original source.....");
    }
}
