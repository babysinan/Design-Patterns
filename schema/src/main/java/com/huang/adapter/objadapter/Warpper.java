package com.huang.adapter.objadapter;

import com.huang.adapter.classdapter.Source;
import com.huang.adapter.classdapter.Targetable;

/**
 * Created by hlp on 2017/4/14.
 * 对象适配器模式
 * 基本思路和类的适配器相同，只是将Adapter类做修改
 * 这次类不继承Source类，而是持有Source类的实例，以达到解决兼容性问题
 */
public class Warpper implements Targetable{
    private Source source;

    public Warpper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method...");
    }
}
