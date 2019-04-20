package creational.abstrac.factory.product;

/**
 * @author adu
 */
public enum ProductType {
    A("ProductA"),
    B("ProductB");

    private String product;

    ProductType(String product) {
        this.product = product;
    }

    public String getValue() {
        return product;
    }

    @Override
    public String toString() {
        return "ProductType{" +
            "product='" + product + '\'' +
            '}';
    }
}