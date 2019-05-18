package com.adu.creation.prototype;

/**
 * @author adu
 * @data 2019/5/18
 */
public class ConcretePrototypeB implements Prototype {

    private String field1;
    private String field2;
    private Element element;

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

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    @Override
    public ConcretePrototypeB clone() {
        try {
            ConcretePrototypeB concretePrototypeB = (ConcretePrototypeB)super.clone();
            concretePrototypeB.setElement(new Element(this.getElement().getName()));
            return concretePrototypeB;
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
