package adu.pattern.creation.factory.method;

/**
 * @author adu
 * @data 2019/5/10
 */
public class ConcreteFactoryA implements Factory {
    @Override
    public Product makeProduct() {
        return new ProductA();
    }
}
