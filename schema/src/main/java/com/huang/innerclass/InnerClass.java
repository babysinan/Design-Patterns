package com.huang.innerclass;

/**
 * Created by hlp on 2017/4/19.
 * 内部类
 * 内部类的意思就是将类的定义放在另一个类的内部。
 * 有时合理的内部类使用会使代码更加简洁，令程序更加巧妙。
 * 而且作为外部类的成员，内部类可以访问外部类私有的成员变量。
 */
public class InnerClass {
    private int a=0;
    class A{
        private int b=10;
        void b(){
            System.out.println("this is the InnerClass.A");
        }
        void build(){
            InnerClass ic = InnerClass.this;
            ic.f();
        }
    }
    void build(){
        A a=new A();
        a.b();
    }
    void f(){

    }
}
