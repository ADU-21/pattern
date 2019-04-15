package creational.abstrac.factory.factory;

import creational.abstrac.factory.product.AbstractProduct;
import creational.abstrac.factory.product.ProductA;
import creational.abstrac.factory.product.ProductB;

/**
 * @author adu
 */
public class FactoryB extends AbstractFactory {

    @Override
    public AbstractProduct manufactureProductA() {
        ProductA productA = new ProductA();
        productA.setBrand(Brand.B);
        return productA;
    }

    @Override
    public AbstractProduct manufactureProductB() {
        ProductB productB = new ProductB();
        productB.setBrand(Brand.B);
        return productB;
    }
}
