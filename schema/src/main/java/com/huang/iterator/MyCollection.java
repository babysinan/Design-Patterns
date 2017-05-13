package com.huang.iterator;

/**
 * Created by hlp on 2017/4/18.
 */
public class MyCollection implements Collection {
    public String string[]={"A","B","C","D"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
