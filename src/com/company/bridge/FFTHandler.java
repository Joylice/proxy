package com.company.bridge;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 15:55
 */
public class FFTHandler extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.FFTSTYLE;
    }

    @Override
    protected Response execute(Request request) {
        System.out.println("FFT数据查询，返回结果");
        return null;
    }
}
