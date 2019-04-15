package creational.abstrac.factory.product;

import creational.abstrac.factory.factory.Brand;

/**
 * @author adu
 */
public class Product extends AbstractProduct {

    private ProductType productType;
    private Brand brand;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
            "productType=" + productType +
            ", brand=" + brand +
            '}';
    }
}
