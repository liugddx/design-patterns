package com.liugddx.proxy;

/**
 * <p>@ClassName User</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/29 14:01
 */
public class User implements IUser{

    @Override
    public void printName(String name) {
        System.out.println(name);
    }
}
