package com.company.bridge;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 15:56
 */
public class TrafficHandler extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.TRAFFICSTYLE;
    }

    @Override
    protected Response execute(Request request) {
        System.out.println("TRA数据查询，返回结果");
        return null;
    }
}
