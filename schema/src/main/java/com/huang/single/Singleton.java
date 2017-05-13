package com.huang.single;

/**
 * Created by hlp on 2017/4/14.
 */
public class Singleton {
    private Singleton(){

    }
    private static class SingletonFactory{
        private static Singleton singleton=new Singleton();
    }
    public static Singleton getInstence(){
        return SingletonFactory.singleton;
    }
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstence();
    }
}
