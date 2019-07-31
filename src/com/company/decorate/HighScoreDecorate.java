package com.company.decorate;

/**
 * @Author: Joylice
 * @Date: 2019/7/22 14:57
 */
public class HighScoreDecorate extends Decorate {
    public HighScoreDecorate(SchoolReport sr) {
        super(sr);
    }


    @Override
    public void report() {
        reportHignScore();
        super.report();
    }

    public void reportHignScore() {
        System.out.println("本次最高分 语文：78；数学：80；自然：85");
    }
}
