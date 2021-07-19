package com.liugddx.command.invoker;

/**
 * <p>@ClassName ListenerInvoker</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/17 21:25
 */
public class ListenerInvoker extends AbstractInvoker {

    Integer order = 1;

    @Override
    public void execute() {
        System.out.println("===========开始时间："+System.currentTimeMillis());
        next.execute();
        System.out.println("===========结束时间："+System.currentTimeMillis());
    }

    @Override
    public void undo() {
        next.undo();
    }
}
