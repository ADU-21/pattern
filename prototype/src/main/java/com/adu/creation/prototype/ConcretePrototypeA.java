package com.adu.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adu
 * @data 2019/5/18
 */
public class ConcretePrototypeA implements Prototype {

    private String field1;
    private String field2;
    private List element;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(List element) {
        this.element = element;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
            "field1='" + field1 + '\'' +
            ", field2='" + field2 + '\'' +
            ", element=" + element +
            '}';
    }
}
