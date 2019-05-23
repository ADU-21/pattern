package com.adu.structural.privataclassdata;

/**
 * @author adu
 * @data 2019/5/23
 */
public class Client {
    public static void main(String[] args) {
        DataClass dataClass = new DataClass(1L, 2L);
        ImmutableClass immutableClass = new ImmutableClass(dataClass);

        System.out.println(immutableClass.sum());
    }
}
