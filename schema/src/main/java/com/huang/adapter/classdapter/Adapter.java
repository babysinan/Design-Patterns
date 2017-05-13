package com.huang.adapter.classdapter;

/**
 * Created by hlp on 2017/4/14.
 *类适配器模式
 *核心思想就是
 *有一个Source 类拥有一个方法，待适配目标接口Targetabe，通过Adapter类将Source功能扩展到Targetable里
 */
public class Adapter extends Source implements Targetable{

    @Override
    public void method2() {
        System.out.println("this targetable mothod..");
    }
}
