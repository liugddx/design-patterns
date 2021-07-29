package com.liugddx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>@ClassName MyInvokerHandler</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/29 14:03
 */
public class MyInvokerHandler implements InvocationHandler {

    private final IUser user;

    public MyInvokerHandler(IUser user){
        this.user = user;
    }

    private void printMethodName(Method method){
        System.out.println(method.getName());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.printMethodName(method);
        return method.invoke(user,args);
    }
}
