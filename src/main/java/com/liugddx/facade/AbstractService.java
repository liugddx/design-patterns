package com.liugddx.facade;

/**
 * <p>@ClassName AbstractService</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/8/5 10:03
 */
public abstract class AbstractService implements IService{

    protected int sort;

    @Override
    public int compareTo(AbstractService o) {
        return this.sort-o.sort;
    }
}
