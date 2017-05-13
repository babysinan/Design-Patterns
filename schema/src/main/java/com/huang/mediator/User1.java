package com.huang.mediator;

/**
 * Created by hlp on 2017/4/18.
 */
public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1...");
    }
}
