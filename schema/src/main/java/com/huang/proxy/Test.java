package com.huang.proxy;

/**
 * Created by hlp on 2017/4/14.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
