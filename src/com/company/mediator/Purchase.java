package com.company.mediator;

/**
 * @Author: Joylice
 * @Date: 2019/6/25 16:30
 * 采购管理
 */
public class Purchase {
    /**
     * 根据销售情况购买IBM 电脑
     *
     * @param number
     */
    public void buyIBMcompter(int number) {
        Stock stock = new Stock();
        Sale sale = new Sale();
        int saleStatus = sale.getSellStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑:" + number + "台");
            stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑:" + buyNumber + "台");
        }
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
