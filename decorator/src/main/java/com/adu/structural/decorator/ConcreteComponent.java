package com.adu.structural.decorator;

/**
 * @author adu
 * @data 2019/5/22
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent.operation");
    }
}
