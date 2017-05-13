package com.huang.observer;

/**
 * Created by hlp on 2017/4/18.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
