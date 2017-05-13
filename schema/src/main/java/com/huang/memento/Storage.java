package com.huang.memento;

/**
 * Created by hlp on 2017/4/18.
 */
public class Storage {
    private  Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

//    public void setMemento(Memento memento) {
//        this.memento = memento;
//    }
}
