package com.company.decorate;

/**
 * @Author: Joylice
 * @Date: 2019/7/22 15:09
 */
public class SortedDecorate extends Decorate {
    public SortedDecorate(SchoolReport sr) {
        super(sr);
    }

    @Override
    public void report() {
        sortedReport();
        super.report();

    }

    public void sortedReport() {
        System.out.println("本次排名：38");
    }
}
