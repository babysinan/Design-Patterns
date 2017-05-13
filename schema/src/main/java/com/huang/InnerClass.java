package com.huang;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by hlp on 2017/4/19.
 * 内部类
 * 内部类的意思就是将类定义在另一个类的内部。
 * 优势合理的内部类会是代码更简洁，让程序更加巧妙
 */
public class InnerClass {

    class A{
        int a = 10;
        void b(){
            System.out.println("this is A.b()!");
        }
    }

    void build(){
        A a = new A();
        a.b();
    }
    public void ff(){
        System.out.println(".....");
    }
    public static void reflect(){
        try {
            ClassLoader loader=Thread.currentThread().getContextClassLoader();
            Class clazz=loader.loadClass("com.huang.InnerClass");
            Constructor cons1 = clazz.getDeclaredConstructor((Class[]) null);
            Constructor<InnerClass> cons2 = clazz.getDeclaredConstructor((Class[]) null);
            InnerClass o = (InnerClass)cons1.newInstance();
            InnerClass inner = cons2.newInstance();
            o.ff();
            inner.ff();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        ic.build();

        try {
            ClassLoader loader=Thread.currentThread().getContextClassLoader();
            Class clazz1=loader.loadClass("com.huang.InnerClass");
            Class clazz2=InnerClass.class;
            Constructor<InnerClass> constructor = InnerClass.class.getConstructor((Class[]) null);
            InnerClass innerClass = constructor.newInstance();
            innerClass.ff();
        } catch (Exception e) {
            e.printStackTrace();
        }
        reflect();
    }
}
