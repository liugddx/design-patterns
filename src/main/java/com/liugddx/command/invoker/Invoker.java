package com.liugddx.command.invoker;

import com.liugddx.command.cmd.ICmd;

/**
 * <p>@ClassName HusbandInvoker</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/17 21:07
 */
public interface Invoker {

    /**
     * 增加命令
     * @param cmd
     */
    void add(ICmd cmd);

    /**
     * 设置下一个执行器
     * @param invoker
     */
    void setNext(Invoker invoker);

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
