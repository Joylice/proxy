package com.company.mediator.upgrade;

/**
 * @Author: Joylice
 * @Date: 2019/7/3 14:36
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        //中介者最重要的方法
        //采购电脑
        if (str.equals("purchase.buy")) {
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            this.offSell();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑：" + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑:" + buyNumber + "台");
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑：" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
