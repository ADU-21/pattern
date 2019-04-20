package adu.pattern.creation.abstracat.factory;

/**
 * @author adu
 */
public class FactoryA extends AbstractFactory {

    @Override
    public ProductA manufactureProductA() {
        ProductA productA = new ProductA();
        productA.setProductType(ProductType.A);
        productA.setBrand(Brand.A);
        return productA;
    }

    @Override
    public ProductB manufactureProductB() {
        ProductB productB = new ProductB();
        productB.setBrand(Brand.A);
        productB.setProductType(ProductType.B);
        return productB;
    }
}
