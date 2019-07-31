package com.company.bridge;

/**
 * @Author: Joylice
 * @Date: 2019/7/11 15:28
 */
public abstract class Handler {

    private Handler nextHandler;

    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    //每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    //每个处理者都必须实现的处理任务
    protected abstract Response execute(Request request);

    public final Response handleMassage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getHandlerLevel())) {
            response = this.execute(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMassage(request);
            } else {
                //没有适当的处理者，业务自行处理
            }
        }

        return response;
    }
}
