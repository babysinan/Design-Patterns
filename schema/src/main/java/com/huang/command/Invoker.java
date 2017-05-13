package com.huang.command;

/**
 * Created by hlp on 2017/4/18.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void action(){
        command.exe();
    }
}
