package com.adu.creation.nameingleton;

import com.adu.creation.singleton.Singleton;

/**
 * @author adu
 * @data 2019/5/18
 */
public class Client {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();

        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // changing variable of instance x
        x.name = (x.name).toUpperCase();

        System.out.println("String from x is " + x.name);
        System.out.println("String from y is " + y.name);
        System.out.println("String from z is " + z.name);
        System.out.println("\n");

        // changing variable of instance z
        z.name = (z.name).toLowerCase();

        System.out.println("String from x is " + x.name);
        System.out.println("String from y is " + y.name);
        System.out.println("String from z is " + z.name);
    }
}
