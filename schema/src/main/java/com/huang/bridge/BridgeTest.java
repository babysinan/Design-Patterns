package com.huang.bridge;

/**
 * Created by hlp on 2017/4/17.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge=new MyBridge();
        Sourceable source=new Sub1();
        bridge.setSource(source);
        bridge.method();
        Sourceable source2=new Sub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
