package com.company.Responsibility;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 10:56
 */
public abstract class Handle {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    private Integer level = 0;
    private Handle nextHandle = null;

    public Handle(Integer level) {
        this.level = level;
    }

    public void setNextHandle(Handle handle) {
        nextHandle = handle;
    }

    public void handleMessage(IWoman woman) {
        if (level == woman.getType()) {
            this.response(woman);
        } else {
            if (nextHandle != null) {
                this.nextHandle.handleMessage(woman);
            } else {
                System.out.println("没有可以请示的人，按不同意处理");
            }
        }
    }

    public abstract void response(IWoman woman);
}
