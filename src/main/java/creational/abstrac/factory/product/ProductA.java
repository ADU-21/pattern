package creational.abstrac.factory.product;

import java.io.Serializable;

/**
 * @author adu
 */
public class ProductA extends ProductCommon implements Serializable {
    public ProductA() {
        this.setProductType(ProductType.A);
    }
}
