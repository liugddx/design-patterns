package com.liugddx.command;

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
     * 获取下一个执行器
     * @return
     */
    Invoker getNext();

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
