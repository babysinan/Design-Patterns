package com.huang.single;

/**
 * Created by hlp on 2017/4/14.
 */
public class SingletonTest {
    private static SingletonTest instance=null;
    private static synchronized void synInit(){
        if (instance==null){
            instance=new SingletonTest();
        }
    }
    public static SingletonTest getInstance(){
        if(instance==null){
            synInit();
        }
        return instance;
    }
}
