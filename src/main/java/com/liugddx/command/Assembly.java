package com.liugddx.command;

import com.liugddx.command.cmd.ICmd;
import com.liugddx.command.cmd.WashTheClothesCmd;
import com.liugddx.command.executor.CmdExecutorImpl;
import com.liugddx.command.executor.IcmdExecutor;
import com.liugddx.command.invoker.Husband;
import com.liugddx.command.invoker.Invoker;
import com.liugddx.command.invoker.ListenerInvoker;

/**
 * <p>@ClassName Assembly</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/17 21:32
 */
public class Assembly {

    public Assembly(){

        ICmd cmd = new WashTheClothesCmd();

        Invoker invoker = new Husband();
        invoker.add(cmd);
        Invoker listener =new ListenerInvoker();
        listener.setNext(invoker);

        IcmdExecutor executor = new CmdExecutorImpl();
        executor.first(listener);

        executor.execute();

    }

    public static void main(String[] args) {
        Assembly assembly = new Assembly();
    }

}
