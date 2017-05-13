package com.huang.mediator;

/**
 * Created by hlp on 2017/4/18.
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
