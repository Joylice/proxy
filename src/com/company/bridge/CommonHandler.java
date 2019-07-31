package com.company.bridge;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 15:53
 */
public class CommonHandler extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.COMMSTYLE;
    }

    @Override
    protected Response execute(Request request) {
        System.out.println("通用数据查询，返回结果");
        return null;
    }
}
