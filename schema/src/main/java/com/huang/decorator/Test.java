package com.huang.decorator;

/**
 * Created by hlp on 2017/4/14.
 */
public class Test {
    public static void main(String[] args) {
        Source source=new Source();
        Sourceable sourceable=new Decorator(source);
        sourceable.method();
        source.method();
    }
}
