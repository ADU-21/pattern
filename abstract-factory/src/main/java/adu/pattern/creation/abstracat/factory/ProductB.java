package adu.pattern.creation.abstracat.factory;

import java.io.Serializable;

/**
 * @author adu
 */
public class ProductB extends AbstractProductB implements Serializable {

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
        return "ProductB{" +
            "brand=" + brand +
            ", productType=" + productType +
            '}';
    }
}
