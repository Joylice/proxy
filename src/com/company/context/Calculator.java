package com.company.context;

/**
 * @Author: Joylice
 * @Date: 2019/7/31 9:48
 */

/**
 * 策略枚举
 */
public enum Calculator {
    /**
     * 逻辑处理1
     */
    ADD("+") {
        @Override
        public String exec(int a, int b) {
            return a + value + b;
        }
    },
    /**
     * 逻辑处理2
     */
    SUB("-") {
        @Override
        public String exec(int a, int b) {
            return a +value+ b;
        }
    };
    String value = "";

    Calculator(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * 声明一个抽象函数
     *
     * @param a
     * @param b
     * @return
     */
    public abstract String exec(int a, int b);
}
