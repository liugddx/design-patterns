package com.liugddx.facade;

/**
 * <p>@ClassName AServiceImpl</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/8/5 9:35
 */
public class AserviceImpl extends AbstractService{

    public AserviceImpl(){
        super.sort = 1;
    }

    @Override
    public void doSomething() {
        System.out.println("输出点玩意");
    }
}
