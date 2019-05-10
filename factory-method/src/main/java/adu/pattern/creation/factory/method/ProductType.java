package adu.pattern.creation.factory.method;

/**
 * @author adu
 * @data 2019/5/10
 */
public enum ProductType {
    A("a"), B("b");

    private String type;

    ProductType(String type) {
        this.type = type;
    }

    public String getValue() {
        return type;
    }

    @Override
    public String toString() {
        return "ProductType{" +
            "type='" + type + '\'' +
            '}';
    }
}
