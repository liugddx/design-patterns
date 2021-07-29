package com.liugddx.proxy;

import java.lang.reflect.Proxy;

/**
 * <p>@ClassName ProxyTest</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/29 14:09
 */
public class ProxyTest {

    public static void main(String[] args) {

        IUser user = new User();

        IUser o = (IUser)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{IUser.class}, new MyInvokerHandler(user));

        o.printName("liugd");
    }
}
