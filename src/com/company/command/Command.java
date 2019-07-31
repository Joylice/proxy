package com.company.command;

/**
 * @Author: Joylice
 * @Date: 2019/7/10 14:44
 */
public abstract class Command {
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected CodeGroup codeGroup = new CodeGroup();
    protected PageGroup pageGroup = new PageGroup();

    public abstract void execute();
}
