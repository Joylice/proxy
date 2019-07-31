package com.company.context;

/**
 * @Author: Joylice
 * @Date: 2019/7/31 10:04
 */
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        String result = Calculator.ADD.exec(a, b);
        System.out.println("+结果之和：" + result);
        String res = Calculator.SUB.exec(a, b);
        System.out.println("-结果之差：" + res);
    }
}
