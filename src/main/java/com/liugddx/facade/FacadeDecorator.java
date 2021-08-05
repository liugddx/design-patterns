package com.liugddx.facade;

/**
 * <p>@ClassName FacadeDecorator</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/8/5 10:08
 */
public class FacadeDecorator implements IFacade{

    public FacadeDecorator(IFacade facade){
        this.facade = facade;
    }

    private  final IFacade facade;

    @Override
    public void facadeDoSomething() {
        //TODO 包装器能干啥
        System.out.println("想干啥干啥");
        facade.facadeDoSomething();
    }
}
