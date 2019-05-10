package adu.pattern.creation.factory.method;

/**
 * @author adu
 * @data 2019/5/10
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product makeProduct(ProductType productType) {
        return new ProductB(productType);
    }
}
