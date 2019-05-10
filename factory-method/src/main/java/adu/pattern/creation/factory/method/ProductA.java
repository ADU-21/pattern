package adu.pattern.creation.factory.method;

/**
 * @author adu
 * @data 2019/5/10
 */
public class ProductA extends Product {

    private ProductType productType;

    public ProductA(ProductType productType) {
        this.productType = productType;
    }

    @Override
    String show() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "ProductA{" +
            "productType=" + productType +
            '}';
    }
}
