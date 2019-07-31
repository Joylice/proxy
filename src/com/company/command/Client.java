package com.company.command;

/**
 * @Author: Joylice
 * @Date: 2019/7/10 14:54
 */
public class Client {
    public static void main(String[] args) {
        Command command = new DeletePageCommand();

        Invoker invoker=new Invoker();
        invoker.setCommand(command);
        invoker.Action();
    }
}
