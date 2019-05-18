package com.adu.creation.prototype;

/**
 * @author adu
 * @data 2019/5/18
 */
public class Element {
    private String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Element{" +
            "name='" + name + '\'' +
            '}';
    }
}
