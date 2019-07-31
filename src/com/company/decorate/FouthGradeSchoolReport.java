package com.company.decorate;

/**
 * @Author: Joylice
 * @Date: 2019/7/22 14:46
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的家长：");
        System.out.println("......");
        System.out.println("语文63 数学65 体育93 自然 67");
        System.out.println("                    家长签字：");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名：" + name);
    }
}
