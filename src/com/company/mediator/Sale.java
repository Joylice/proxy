package com.company.mediator;

import java.util.Random;

/**
 * @Author: Joylice
 * @Date: 2019/6/25 16:35
 * 销售管理
 */
public class Sale {

    public void sellIBMComputer(int number) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNum() < number) {
            purchase.buyIBMcompter(number);
        }
        System.out.println("销售IBM" + number + "台");

        stock.decrease(number);
    }

    public int getSellStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况" + saleStatus);
        return saleStatus;
    }

    public void offSale() {
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑:" + stock.getStockNum() + "台");
    }

}
