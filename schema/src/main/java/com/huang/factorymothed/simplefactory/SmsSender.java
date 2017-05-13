package com.huang.factorymothed.simplefactory;

/**
 * Created by hlp on 2017/4/14.
 * 短信
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("SmsSender....");
    }
}
