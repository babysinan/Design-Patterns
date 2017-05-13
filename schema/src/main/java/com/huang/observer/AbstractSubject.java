package com.huang.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by hlp on 2017/4/18.
 */
public abstract class AbstractSubject implements  Subject{
    private Vector<Observer> vector=new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}
