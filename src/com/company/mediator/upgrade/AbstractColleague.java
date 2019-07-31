package com.company.mediator.upgrade;

/**
 * @Author: Joylice
 * @Date: 2019/7/3 15:06
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator=_mediator;
    }
}
