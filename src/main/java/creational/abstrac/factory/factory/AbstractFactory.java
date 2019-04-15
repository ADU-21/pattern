package creational.abstrac.factory.factory;

import creational.abstrac.factory.product.AbstractProduct;

/**
 * @author adu
 */
public abstract class AbstractFactory {
    public abstract AbstractProduct manufactureProductA();

    public abstract AbstractProduct manufactureProductB();
}
