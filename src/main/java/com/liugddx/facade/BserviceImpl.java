package com.liugddx.facade;

/**
 * <p>@ClassName BserviceImpl</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/8/5 9:36
 */
public class BserviceImpl extends AbstractService{

    public BserviceImpl(){
        super.sort = 2;
    }

    @Override
    public void doSomething() {
        System.out.println("我也要输出点玩意");
    }

}
