package com.adu.creation.prototype;

/**
 * @author adu
 * @data 2019/5/18
 */
public class Client {
    public static void main(String[] args) {
        // Shallow copy
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setField1("filed1");
        prototypeA.setField2("filed2");
        Element element = new Element("name");
        prototypeA.setElement(element);

        ConcretePrototypeA prototype1 = prototypeA.clone();
        element.setName("nameChanged");
        prototype1.setField1("filedA");

        System.out.println(prototypeA);
        System.out.println(prototype1);

        // Deep copy
        ConcretePrototypeB prototypeB = new ConcretePrototypeB();
        prototypeB.setField1("field1");
        prototypeB.setField2("field2");
        Element elementB = new Element("name");
        prototypeB.setElement(elementB);

        ConcretePrototypeB prototype2 = prototypeB.clone();
        elementB.setName("nameChanged");
        prototype2.setField2("filedB");

        System.out.println(prototypeB);
        System.out.println(prototype2);
    }
}
