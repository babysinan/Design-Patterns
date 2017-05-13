package com.huang.command;

/**
 * Created by hlp on 2017/4/18.
 */
public class MyCommand implements Command{
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
