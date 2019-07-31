package com.company.bridge;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 16:13
 */
public class Main {
    public static void main(String[] args) {
       Handler handler=HandleChain.initChain();
       handler.handleMassage(new Request());
    }
}
