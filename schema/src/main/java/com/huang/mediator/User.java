package com.huang.mediator;

/**
 * Created by hlp on 2017/4/18.
 */
public abstract class User {
    private  Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void work();
}
