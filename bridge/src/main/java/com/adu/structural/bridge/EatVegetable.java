package com.adu.structural.bridge;

/**
 * @author adu
 * @data 2019/5/21
 */
public class EatVegetable implements EatFood {
    @Override
    public String eat() {
        return "vegetable";
    }
}
