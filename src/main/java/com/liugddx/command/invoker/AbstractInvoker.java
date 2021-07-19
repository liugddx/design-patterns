package com.liugddx.command.invoker;

import com.liugddx.command.cmd.ICmd;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>@ClassName AbstractInvoker</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/17 21:22
 */
public abstract class AbstractInvoker implements Invoker {

    protected Integer order = 0;

    protected final List<ICmd> allCmd = new ArrayList<>();

    protected Invoker next;

    @Override
    public void add(ICmd cmd){
        allCmd.add(cmd);
    }

    @Override
    public void setNext(Invoker next) {
        this.next = next;
    }


}
