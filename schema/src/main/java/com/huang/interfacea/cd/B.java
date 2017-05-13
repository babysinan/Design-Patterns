package com.huang.interfacea.cd;

import com.huang.interfacea.ab.AA;
import com.sun.imageio.stream.StreamFinalizer;

/**
 * Created by hlp on 2017/4/25.
 */
public class B implements AA {
    public static B b=null;
    public void isAlive(){
        System.out.println("is alive...");
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("fianlize method executed");
        b=this;
    }

    public static void main(String[] args) throws Throwable {
        b=new B();
        b=null;
        System.gc();
        Thread.sleep(500);
        if(b!=null){
            b.isAlive();
        }else {
            System.out.println("no,i am dead");
        }
        ///
        b=null;
        System.gc();
        Thread.sleep(500);
        if(b!=null){
            b.isAlive();
        }else {
            System.out.println("no,i am dead");
        }
    }

}
