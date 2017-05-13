package com.huang.mediator;

/**
 * Created by hlp on 2017/4/18.
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2....");
    }
}
