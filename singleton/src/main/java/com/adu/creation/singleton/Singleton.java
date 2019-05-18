package com.adu.creation.singleton;

import java.util.Optional;

/**
 * @author adu
 * @data 2019/5/18
 */
public final class Singleton {
    private static Singleton INSTANCE = null;
    public String name;

    private Singleton() {
        this.name = "This is a singleton.";
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
