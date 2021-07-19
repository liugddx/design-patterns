package com.liugddx.command.executor;

import com.liugddx.command.invoker.Invoker;

/**
 * <p>@InterfaceName IcmdExecutor</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/19 19:03
 */
public interface IcmdExecutor {
    /**
     * 初始化拦截器
     * @param first
     */
    void first(Invoker first);

    /**
     * 命令执行器，封装filter
     * @return
     */
    void execute();

    /**
     * 反悔命令
     * @return
     */
    void undo();
}
