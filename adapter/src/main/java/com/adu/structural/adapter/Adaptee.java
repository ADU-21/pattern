package com.adu.structural.adapter;

import java.util.ArrayList;

/**
 * @author adu
 * @data 2019/5/19
 */
public class Adaptee {
    public static Object get(Object o) {
        if (o instanceof String) {
            return o;
        }
        if (o instanceof Long) {
            return o;
        }
        return new ArrayList<>();
    }
}
