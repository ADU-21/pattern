package adu.pattern.creation.factory.method;

/**
 * @author adu
 * @data 2019/5/10
 */
public class ProductB extends Product {

    private ProductType productType;

    public ProductB(ProductType productType) {
        this.productType = productType;
    }

    @Override
    String show() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "ProductB{" +
            "productType=" + productType +
            '}';
    }
}
