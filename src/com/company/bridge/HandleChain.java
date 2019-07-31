package com.company.bridge;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 16:06
 */
public class HandleChain {
    public static Handler initChain() {
        CommonHandler commonHandler = new CommonHandler();
        FFTHandler fftHandler = new FFTHandler();
        TrafficHandler trafficHandler = new TrafficHandler();
        AlertHandler alertHandler = new AlertHandler();

        commonHandler.setNext(fftHandler);
        fftHandler.setNext(alertHandler);
        alertHandler.setNext(trafficHandler);

        return commonHandler;
    }
}
