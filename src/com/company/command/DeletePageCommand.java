package com.company.command;

/**
 * @Author: Joylice
 * @Date: 2019/7/10 15:04
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pageGroup.delete();
    }
}
