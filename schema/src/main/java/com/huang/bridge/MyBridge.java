package com.huang.bridge;

/**
 * Created by hlp on 2017/4/17.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
