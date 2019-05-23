package com.adu.structural.flyweight;

/**
 * @author adu
 * @data 2019/5/23
 */
public class ConcreteFlyweight implements Flyweight {

    private String intrinsicAttribute;
    private String extrinsicAttribute;

    public ConcreteFlyweight(String intrinsicAttribute) {
        this.intrinsicAttribute = intrinsicAttribute;
    }

    @Override
    public void operation(String state) {
        this.extrinsicAttribute = state;

        System.out.println("Intrinsic attribute: " + this.intrinsicAttribute);
        System.out.println("Extrinsic attribute: " + this.extrinsicAttribute);
    }
}
