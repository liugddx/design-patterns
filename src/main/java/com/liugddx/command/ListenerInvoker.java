package com.liugddx.command;

/**
 * <p>@ClassName ListenerInvoker</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/17 21:25
 */
public class ListenerInvoker extends AbstractInvoker{

    @Override
    public void execute() {

        next.getNext().execute();
    }

    @Override
    public void undo() {
        next.getNext().undo();
    }
}
