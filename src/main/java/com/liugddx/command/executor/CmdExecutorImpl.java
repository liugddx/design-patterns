package com.liugddx.command.executor;

import com.liugddx.command.invoker.Invoker;

/**
 * <p>@ClassName CmdExecutorImpl</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/19 19:04
 */
public class CmdExecutorImpl implements IcmdExecutor {

    protected Invoker invoker;

    @Override
    public void first(Invoker first) {
        this.invoker = first;
    }

    @Override
    public void execute() {
        invoker.execute();
    }

    @Override
    public void undo() {
        invoker.undo();
    }
}
