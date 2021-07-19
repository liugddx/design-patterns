package com.liugddx.command.cmd;

/**
 * <p>@ClassName ICmd</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/17 21:03
 */
public interface ICmd {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();

}
