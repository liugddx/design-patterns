package com.liugddx.decorator;

/**
 * <p>@ClassName HelloDecorator</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/29 13:26
 */
public class HelloDecorator implements Hello{

    private Hello hello;

    public HelloDecorator(Hello hello){
        this.hello = hello;
    }

    @Override
    public void sayHello(String name) {
        this.valid(name);
        hello.sayHello(name);
    }

    private void valid(String name){
        if ("liugd".equals(name)){
            System.out.println("来了老弟！");
        }
    }
}
