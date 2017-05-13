package com.huang.adapter.interfaceadapter;

/**
 * Created by hlp on 2017/4/14.
 * 接口适配器模式
 * 有时我们写的一个接口类中有多个抽象方法
 * 当我们些接口的实现类是必须实现其所有方法
 * 这明显有时比较浪费，因为并不是所有方法都是我们需要的，有时只需要 某些方法
 * 接口适配器模式就为我们解决了这个问题
 * 借助于一个抽象类 该类实现了接口，实现了所有方法
 * 而我们不与原来的接口打交道，之和该抽象类取得联系
 * 所以我们写一个类继承该抽象类，重写我们需要的方法就行
 */
public abstract class Wapper implements Sourceable {
    @Override
    public void method1() {
//        System.out.println("wapper method1....");
    }

    @Override
    public void method2() {
//        System.out.println("wapper method2.....");
    }

}
