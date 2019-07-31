package com.company.decorate;

/**
 * @Author: Joylice
 * @Date: 2019/7/22 14:50
 */
public class Decorate extends SchoolReport {

    private   SchoolReport sr;

    public Decorate(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
