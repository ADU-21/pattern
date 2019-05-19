package com.adu.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adu
 * @data 2019/5/19
 */
public class Adapter implements Target {
    @Override
    public String getString() {
        return (String)Adaptee.get("string");
    }

    @Override
    public Long getLong() {
        return (Long)Adaptee.get(100L);
    }

    @Override
    public List getList() {
        return (List)Adaptee.get(new ArrayList<>());
    }
}
