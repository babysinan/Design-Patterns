package com.huang.observer;

/**
 * Created by hlp on 2017/4/18.
 */
public interface Subject {
    //添加观察者
    public void add(Observer observer);
    //删除观察者
    public void delete(Observer observer);
    //通知所有观察者
    public void notifyObservers();
    //自身操作
    public void operation();
}
