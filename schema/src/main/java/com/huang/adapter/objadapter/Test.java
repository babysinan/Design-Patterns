package com.huang.adapter.objadapter;

import com.huang.adapter.classdapter.Source;
import com.huang.adapter.classdapter.Targetable;

/**
 * Created by hlp on 2017/4/14.
 */
public class Test {
    public static void main(String[] args) {
        Source source=new Source();
        Targetable targetable=new Warpper(source);
        targetable.method1();
        targetable.method2();
    }
}
