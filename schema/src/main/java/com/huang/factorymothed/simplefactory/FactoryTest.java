package com.huang.factorymothed.simplefactory;

/**
 * Created by hlp on 2017/4/14.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory=new SimpleFactory();
        Sender sender=null;
        sender = factory.produce("mail");
        sender.send();
        sender=factory.produce("sms");
        sender.send();
    }
}
