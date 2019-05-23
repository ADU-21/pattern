package com.adu.structural.flyweight;

/**
 * @author adu
 * @data 2019/5/23
 */
public class Client {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        ConcreteFlyweight f1 = flyWeightFactory.factory("a");
        ConcreteFlyweight f2 = flyWeightFactory.factory("b");
        ConcreteFlyweight f3 = flyWeightFactory.factory("a");

        f1.operation("a fly weigh");
        f2.operation("b fly weigh");
        f3.operation("c fly weigh");

        System.out.println(f1 == f3);
        System.out.println(flyWeightFactory.getFlyweightSize());
    }
}
