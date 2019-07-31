package com.company.command;

/**
 * @Author: Joylice
 * @Date: 2019/7/10 15:05
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        requirementGroup.add();
    }
}
