package creational.abstrac.factory.factory;

import creational.abstrac.factory.product.AbstractProductA;
import creational.abstrac.factory.product.AbstractProductB;
import creational.abstrac.factory.product.ProductA;
import creational.abstrac.factory.product.ProductB;
import creational.abstrac.factory.product.ProductType;

/**
 * @author adu
 */
public class FactoryB extends AbstractFactory {

    @Override
    public AbstractProductA manufactureProductA() {
        ProductA productA = new ProductA();
        productA.setProductType(ProductType.A);
        productA.setBrand(Brand.B);
        return productA;
    }

    @Override
    public AbstractProductB manufactureProductB() {
        ProductB productB = new ProductB();
        productB.setBrand(Brand.B);
        productB.setProductType(ProductType.B);
        return productB;
    }
}
