package com.adu.structural.bridge;

/**
 * @author adu
 * @data 2019/5/21
 */
public class RestaurantA extends Restaurant {
    public RestaurantA(EatFood eatFood) {
        super(eatFood);
    }

    @Override
    public String action() {
        return String.format("Eat %s in restaurantA", eatFood.eat());
    }
}
