package com.huang.proxy;

/**
 * Created by hlp on 2017/4/14.
 * 代理模式
 * 其实每个模式的名字就表明了该模式的作用
 * 代理模式就是多一个代理类出来，提原来的对象进行一些操作
 * 比如我们找房子 找中介；打官司 找律师
 * 如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
 * 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
 * 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
 *  使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 *
 *  代理模式与装饰器模式的区别
 *  代理模式 代理类（proxy class）可以对它的客户隐藏一个对象的具体信息
 */
public class Proxy implements Sourceable{
    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }
    private void before(){
        System.out.println("before...");
    }
    private void after(){
        System.out.println("after....");
    }
}
