package com.huang.observer;

/**
 * Created by hlp on 2017/4/18.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("this is the observer1");
    }
}
