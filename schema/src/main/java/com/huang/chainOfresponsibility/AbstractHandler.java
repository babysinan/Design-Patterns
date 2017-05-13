package com.huang.chainOfresponsibility;

/**
 * Created by hlp on 2017/4/18.
 */
public abstract  class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
