package adu.pattern.creation.abstracat.factory;

/**
 * @author adu
 */
public class FactoryB extends AbstractFactory {

    @Override
    public AbstractProductA manufactureProductA() {
        return new BrandAProductA();
    }

    @Override
    public AbstractProductB manufactureProductB() {
        return new BrandAProductB();
    }
}
