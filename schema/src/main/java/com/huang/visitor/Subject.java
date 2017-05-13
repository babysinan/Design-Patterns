package com.huang.visitor;

/**
 * Created by hlp on 2017/4/18.
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
