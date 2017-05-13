package com.huang.adapter.interfaceadapter;

/**
 * Created by hlp on 2017/4/14.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable sourceable1=new SourceSub1();
        sourceable1.method1();
        sourceable1.method2();
        Sourceable sourceable2=new SourceSub2();
        sourceable2.method1();
        sourceable2.method2();
    }
}
