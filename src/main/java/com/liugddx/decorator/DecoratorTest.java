package com.liugddx.decorator;

/**
 * <p>@ClassName DecoratorTest</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/29 13:37
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();

        Hello decorator = new HelloDecorator(hello);

        decorator.sayHello("liugd");
    }

}
