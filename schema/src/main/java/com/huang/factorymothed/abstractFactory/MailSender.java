package com.huang.factorymothed.abstractFactory;

/**
 * Created by hlp on 2017/4/14.
 * 邮件
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("MailSender......");
    }
}
