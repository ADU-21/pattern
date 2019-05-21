package com.adu.structural.bridge;

/**
 * @author adu
 * @data 2019/5/21
 */
public class RestaurantC extends Restaurant {
    public RestaurantC(EatFood eatFood) {
        super(eatFood);
    }

    @Override
    public String action() {
        return String.format("Eat %s in restaurantC", eatFood.eat());
    }
}
