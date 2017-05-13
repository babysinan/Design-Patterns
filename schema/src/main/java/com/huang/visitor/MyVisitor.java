package com.huang.visitor;

/**
 * Created by hlp on 2017/4/18.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visit this subject "+sub.getSubject());
    }
}
