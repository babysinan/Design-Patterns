package com.huang.factorymothed.simplefactory;

/**
 * Created by hlp on 2017/4/14.
 * 多个工厂方法模式
 * 是对普通工厂方法模式的改进，
 * 在普通工厂方法模式中，
 * 如果传递的字符串出错，
 * 则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，
 * 分别创建对象
 */
public class MulFactory {
    public Sender produceSms(){
        return new SmsSender();
    }
    public Sender produceMail(){
        return new MailSender();
    }
}
