package com.huang.visitor;

/**
 * Created by hlp on 2017/4/18.
 */
public class Test {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
