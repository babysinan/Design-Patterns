package com.huang.visitor;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hlp on 2017/4/27.
 */
public class VolatileTest {
    public static AtomicInteger aa=new AtomicInteger(0);
    public static  volatile int rece=0;
    public static void increase(){
        aa.incrementAndGet();
        rece=rece+1;
    }
    public void tt(){
        ThreadLocal threadLocal=new ThreadLocal();
    }
    private static final int COUNT=20;

    public static void main(String[] args) {
        Thread [] threads=new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        //等待所有线程结束
        while (Thread.activeCount()>1)
            Thread.yield();
            synchronized (VolatileTest.class){
                Math.sin(13);
            }

        System.out.println(rece);
    }
}
