package com.adu.structural.bridge;

/**
 * @author adu
 * @data 2019/5/21
 */
public class RestaurantB extends Restaurant {
    public RestaurantB(EatFood eatFood) {
        super(eatFood);
    }

    @Override
    public String action() {
        return String.format("Eat %s in restaurantB", eatFood.eat());
    }
}
