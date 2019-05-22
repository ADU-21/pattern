package com.adu.structural.decorator;

/**
 * @author adu
 * @data 2019/5/22
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent original = new ConcreteComponent();
        Component component = new ConcreteDecorator(original);
        component.operation();
    }
}
