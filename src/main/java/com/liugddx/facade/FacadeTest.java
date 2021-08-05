package com.liugddx.facade;

/**
 * <p>@ClassName FacadeTest</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/8/5 10:06
 */
public class FacadeTest {

    public static void main(String[] args) {

        IService[] services = new IService[]{new AserviceImpl(),new BserviceImpl()};

        AfacadeImpl afacade = new AfacadeImpl();
        afacade.setServices(services);

        IFacade facade = new FacadeDecorator(afacade);

        facade.facadeDoSomething();

    }

}
