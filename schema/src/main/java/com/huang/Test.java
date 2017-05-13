package com.huang;

/**
 * Created by hlp on 2017/4/19.
 */
public class Test {
    private String name;
    private Integer a;
    private int b;

    public Test() {
    }

    public Test(String name) {
        this.name = name;
    }

    public void t(String ...a){
        System.out.println(a);
        System.out.println(a[0]+a[1]);
    }
    public void t(String a){
        System.out.println(a);
    }

    public void tt(String str,Integer a,int b,Test tt){
        str="ffff";
        a=12;
        b=13;
        tt.name="CCCCC";
        tt=new Test("BBBB");
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        new Test().t("a");
//        new Test().t("a","b");
//        Ec.INSTENCE.f();
//        String t="aaa";
//        Integer a=10;
//        int b=9;
//        Test tt=new Test("AAAA");
//        System.out.println(tt);
//        tt.tt(t,a,b,tt);
//        System.out.println(t);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(tt);
//        String s;
//        System.out.println(s);
//        Integer a;
//        System.out.printf(a);
//        int c;
//        System.out.println(c);
        Test test = new Test();
        System.out.println(test.a);
        System.out.println(test.b);
        System.out.println(test.name);
    }
}
