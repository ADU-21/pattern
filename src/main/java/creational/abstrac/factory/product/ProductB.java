package creational.abstrac.factory.product;

import java.io.Serializable;

/**
 * @author adu
 */
public class ProductB extends Product implements Serializable {

    public ProductB() {
        this.setProductType(ProductType.B);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
