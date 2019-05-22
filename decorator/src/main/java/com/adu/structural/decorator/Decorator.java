package com.adu.structural.decorator;

/**
 * @author adu
 * @data 2019/5/22
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
