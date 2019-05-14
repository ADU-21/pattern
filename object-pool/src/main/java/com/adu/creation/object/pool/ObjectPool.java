package com.adu.creation.object.pool;

import java.util.HashSet;
import java.util.Set;

/**
 * @author adu
 * @data 2019/5/14
 */
public abstract class ObjectPool<T> {

    private Set<T> available = new HashSet<>();
    private Set<T> inUse = new HashSet<>();

    public abstract T create();

    public synchronized T checkout() {
        if (available.isEmpty()) {
            available.add(create());
        }
        T next = available.iterator().next();
        available.remove(next);
        inUse.add(next);
        return next;
    }

    public synchronized void checkIn(T next) {
        inUse.remove(next);
        available.add(next);
    }

    @Override
    public String toString() {
        return "ObjectPool{" +
            "available=" + available.size() +
            ", inUse=" + inUse.size() +
            '}';
    }
}
