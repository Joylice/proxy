package com.company.Responsibility;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 10:11
 */
public class Woman implements IWoman {

    private int type;
    private String request;

    public Woman(int _type, String _request) {
        this.type = _type;
        this.request = _request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
