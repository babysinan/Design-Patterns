package com.huang.factorymothed.simplefactory;

/**
 * Created by hlp on 2017/4/14.
 * 静态工厂方法模式
 * 方法提供为静态，不需要创建实例,直接调用
 */
public class StaticMothedFactory {
    public static Sender produceMail(){
        return  new MailSender();
    }
    public static  Sender produceSms(){
        return new SmsSender();
    }
}
