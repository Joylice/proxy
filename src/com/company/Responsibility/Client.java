package com.company.Responsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 10:20
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        List<IWoman> women = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            women.add(new Woman(random.nextInt(4), "我想去逛街"));
        }
        Handle father = new Father();
        Handle husband = new Husband();
        Handle son = new Son();
        father.setNextHandle(husband);
        husband.setNextHandle(son);
        for (IWoman woman : women) {
            father.handleMessage(woman);
        }
    }
}
