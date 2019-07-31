package com.company.Responsibility;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 10:16
 */
public class Husband extends Handle {
    public Husband() {
        super(HUSBAND_LEVEL_REQUEST);
    }


    @Override
    public void response(IWoman woman) {
        System.out.println("媳妇请示：" + woman.getRequest());
        System.out.println("丈夫回复：可以的");
    }
}
