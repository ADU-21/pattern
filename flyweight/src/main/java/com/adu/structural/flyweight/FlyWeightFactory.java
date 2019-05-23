package com.adu.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adu
 * @data 2019/5/23
 */
public class FlyWeightFactory {
    private Map<String, ConcreteFlyweight> flyWeights = new HashMap<>();

    public ConcreteFlyweight factory(String name) {
        ConcreteFlyweight flyweight = this.flyWeights.get(name);
        if (null == flyweight) {
            flyweight = new ConcreteFlyweight(name);
            this.flyWeights.put(name, flyweight);
        }
        return flyweight;
    }

    public int getFlyweightSize() {
        return this.flyWeights.size();
    }
}
