package com.liugddx.command;

/**
 * <p>@ClassName AbstractInvoker</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/17 21:22
 */
public abstract class AbstractInvoker implements Invoker{

    protected Invoker next;

    @Override
    public Invoker getNext() {
        return next;
    }

    @Override
    public void setNext(Invoker next) {
        this.next = next;
    }


}
