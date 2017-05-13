package com.huang.bridge;

/**
 * Created by hlp on 2017/4/17.
 * 桥接模式
 */
public abstract class Bridge {
    private Sourceable source;
    public void method(){
        source.method();
    }
    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
