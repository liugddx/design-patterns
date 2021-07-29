package com.liugddx.decorator;

/**
 * <p>@ClassName HelloImpl</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/29 13:25
 */
public class HelloImpl implements Hello{

    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+name);
    }
}
