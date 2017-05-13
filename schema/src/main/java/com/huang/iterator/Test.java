package com.huang.iterator;

import java.util.LinkedList;

/**
 * Created by hlp on 2017/4/18.
 */
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        LinkedList linkedList = new LinkedList();
        java.util.Iterator iterator = linkedList.iterator();
    }
}
