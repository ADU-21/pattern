package creational.abstrac.factory.product;

import java.io.Serializable;

/**
 * @author adu
 */
public class ProductA extends Product implements Serializable {

    public ProductA() {
        this.setProductType(ProductType.A);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
