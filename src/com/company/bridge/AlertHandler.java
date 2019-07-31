package com.company.bridge;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 16:09
 */
public class AlertHandler extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.ALERTSTYLE;
    }

    @Override
    protected Response execute(Request request) {
        System.out.println("alert 数据获取，返回结果");
        return null;
    }
}
