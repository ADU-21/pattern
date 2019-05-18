package com.adu.creation.prototype;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author adu
 * @data 2019/5/18
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototypeA prototype = new ConcretePrototypeA();
        prototype.setField1("filed1");
        prototype.setField2("filed2");
        prototype.setElement(Arrays.asList("a", "b"));
        Prototype prototype1 = prototype.clone();
        prototype.setField1("filedA");

        System.out.println(prototype);
        System.out.println(prototype1);
    }
}
