package com.company.decorate;

/**
 * @Author: Joylice
 * @Date: 2019/7/22 15:04
 */
public class Father {

    public static void main(String[] args) {
        SchoolReport sr = new FouthGradeSchoolReport();
        Decorate decorate = new HighScoreDecorate(sr);
        Decorate decorate1 = new SortedDecorate(sr);
        decorate.report();
        decorate1.report();
        decorate.sign("张三");
    }
}
