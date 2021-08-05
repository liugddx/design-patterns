package com.liugddx.reflection;

import java.lang.reflect.Field;

/**
 * <p>@ClassName ReflectionTest</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/8/5 10:44
 */
public class ReflectionTest {

    public static void main(String[] args) {
        User user = new User();
        for (Field field : user.getClass().getFields()) {
            System.out.println(field.getName());
        }
    }

}
