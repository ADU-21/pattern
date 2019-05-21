package com.adu.structural.bridge;

/**
 * @author adu
 * @data 2019/5/21
 */
public abstract class Restaurant {
    protected EatFood eatFood;

    public Restaurant(EatFood eatFood) {
        this.eatFood = eatFood;
    }

    public abstract String action();
}
