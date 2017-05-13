package com.huang.factorymothed.abstractFactory;

/**
 * Created by hlp on 2017/4/14.
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
