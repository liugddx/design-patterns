package com.liugddx.command.invoker;

import com.liugddx.command.cmd.ICmd;

/**
 * <p>@ClassName Husband</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/17 21:10
 */
public class Husband extends AbstractInvoker {

    @Override
    public void execute() {
        this.allCmd.forEach(ICmd::execute);
    }

    @Override
    public void undo() {
        this.allCmd.forEach(ICmd::undo);
    }
}
