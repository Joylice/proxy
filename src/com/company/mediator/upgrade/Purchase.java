package com.company.mediator.upgrade;

/**
 * @Author: Joylice
 * @Date: 2019/7/3 15:11
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", 100);
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
