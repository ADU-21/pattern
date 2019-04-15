package creational.abstrac.factory.product;

public enum ProductType {
    A("ProductA"),
    B("ProductB");

    private String product;

    ProductType(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductType{" +
            "product='" + product + '\'' +
            '}';
    }
}
