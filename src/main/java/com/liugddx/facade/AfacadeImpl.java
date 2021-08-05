package com.liugddx.facade;

import java.util.Arrays;

/**
 * <p>@ClassName AfacadeImpl</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/8/5 9:41
 */
public class AfacadeImpl implements IFacade{

    private IService[] services;

    public void setServices(IService[]  services){
        this.services = services;
    }


    @Override
    public void facadeDoSomething() {
        Arrays.stream(services).sorted().forEach(IService::doSomething);
    }
}
