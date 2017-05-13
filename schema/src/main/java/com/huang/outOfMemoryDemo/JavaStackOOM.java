package com.huang.outOfMemoryDemo;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.Queue;

/**
 * Created by hlp on 2017/4/25.
 */
public class JavaStackOOM {
    private void doStoo(){
        while (true){

        }
    }
    public void stackLeakByThread(){
        while (true){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    doStoo();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Exception {
        Field field=Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe unsafe=(Unsafe) field.get(null);
        Unsafe unsafe1 = Unsafe.getUnsafe();
        Object o=new Object();
//        o.finalize();
//        Queue
        while (true){
            unsafe.allocateMemory(1014);

        }
//        JavaStackOOM oom=new JavaStackOOM();
//        oom.stackLeakByThread();
//        String str1=new StringBuffer("计算机").append("软件").toString();
//        System.out.println(str1.intern()==str1);
//        String str2=new StringBuffer("ja").append("va").toString();
//        System.out.println(str2.intern()==str2);
    }
}
interface  AA{
      void f();
}
