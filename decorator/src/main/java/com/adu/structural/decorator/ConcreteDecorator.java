package com.adu.structural.decorator;

/**
 * @author adu
 * @data 2019/5/22
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        this.component.operation();
        this.additionalOperation();
    }

    private void additionalOperation() {
        System.out.println("ConcreteDecorator.additionalOperation");
    }
}
