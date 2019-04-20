package adu.pattern.creation.abstracat.factory;

import java.io.Serializable;

/**
 * @author adu
 */
public class BrandBProductB extends AbstractProductB implements Serializable {

    private static final Brand brand = Brand.B;
    private static final ProductType productType = ProductType.B;

    @Override
    public String toString() {
        return "BrandAProductA{" +
            "brand=" + brand +
            ", productType=" + productType +
            '}';
    }
}
