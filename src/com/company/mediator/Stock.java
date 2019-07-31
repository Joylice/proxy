package com.company.mediator;

/**
 * @Author: Joylice
 * @Date: 2019/6/25 16:32
 * 存货管理
 */
public class Stock {
    private static int COMPUTER_NUM = 100;

    public void increase(int number) {
        COMPUTER_NUM = COMPUTER_NUM + number;
        System.out.println("库存数量：" + COMPUTER_NUM);
    }

    public void decrease(int number) {
        COMPUTER_NUM = COMPUTER_NUM - number;
        System.out.println("库存数量：" + COMPUTER_NUM);
    }

    public int getStockNum() {
        return COMPUTER_NUM;
    }

    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理库存数量：" + COMPUTER_NUM);
        //打折出售
        sale.offSale();
        //不再采购
        purchase.refuseBuyIBM();
    }
}
