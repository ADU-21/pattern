package creational.abstrac.factory.factory;

import creational.abstrac.factory.product.AbstractProductA;
import creational.abstrac.factory.product.AbstractProductB;

/**
 * @author adu
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA manufactureProductA();

    public abstract AbstractProductB manufactureProductB();
}
