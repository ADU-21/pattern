package com.adu.structural.bridge;

/**
 * @author adu
 * @data 2019/5/21
 */
public class Client {
    public static void main(String[] args) {
        RestaurantA restaurantA = new RestaurantA(new EatMeat());
        System.out.println(restaurantA.action());

        RestaurantB restaurantB = new RestaurantB(new EatVegetable());
        System.out.println(restaurantB.action());
    }
}
