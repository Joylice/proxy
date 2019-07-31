package com.company.Responsibility;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 10:15
 */
public class Father extends Handle {


    public Father() {
        super(FATHER_LEVEL_REQUEST);
    }

    @Override
    public void response(IWoman woman) {
        System.out.println("女儿请示：" + woman.getRequest());
        System.out.println("父亲：同意");
    }
}
