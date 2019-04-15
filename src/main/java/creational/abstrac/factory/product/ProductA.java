package creational.abstrac.factory.product;

import java.io.Serializable;

import creational.abstrac.factory.factory.Brand;

/**
 * @author adu
 */
public class ProductA extends AbstractProductA implements Serializable {

    private Brand brand;
    private ProductType productType;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "ProductA{" +
            "brand=" + brand +
            ", productType=" + productType +
            '}';
    }
}
