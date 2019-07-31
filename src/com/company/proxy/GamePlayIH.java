package com.company.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Joylice
 * @Date: 2019/6/20 14:34
 */
public class GamePlayIH implements InvocationHandler {
    Class cls = null;
    Object obj = null;

    public GamePlayIH(Object _obj) {
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = method.invoke(this.obj, args);
        return o;
    }
}
