package com.company.command;

/**
 * @Author: Joylice
 * @Date: 2019/7/10 14:56
 */
public class Invoker {
    private Command _command = null;

    public void setCommand(Command command) {
        this._command = command;
    }

    public void Action() {
        _command.execute();
    }
}
