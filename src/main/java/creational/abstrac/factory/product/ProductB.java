package creational.abstrac.factory.product;

import java.io.Serializable;

/**
 * @author adu
 */
public class ProductB extends ProductCommon implements Serializable {

    public ProductB() {
        this.setProductType(ProductType.B);
    }
}
