package com.liugddx.command;

/**
 * <p>@ClassName WashTheClothesCmd</p>
 * <p>@description TODO</p>
 *
 * @author Ethan.liu
 * @version 1.0
 * @date 2021/7/17 21:29
 */
public class WashTheClothesCmd implements ICmd{

    private final WashingMachine  washingMachine= new WashingMachine();

    @Override
    public void execute() {
        washingMachine.washTheClothes();
    }

    @Override
    public void undo() {

    }
}
