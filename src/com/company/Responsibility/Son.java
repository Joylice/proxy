package com.company.Responsibility;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 10:19
 */
public class Son extends Handle {
    public Son() {
        super(SON_LEVEL_REQUEST);
    }

    @Override
    public void response(IWoman woman) {
        System.out.println("母亲请示:" + woman.getRequest());
        System.out.println("儿子回复：去吧");
    }
}
