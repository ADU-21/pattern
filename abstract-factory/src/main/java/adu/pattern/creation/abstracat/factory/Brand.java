package adu.pattern.creation.abstracat.factory;

/**
 * @author adu
 */
public enum Brand {
    A("BrandA"),
    B("BrandB");

    private String brand;

    Brand(String brand) {
        this.brand = brand;
    }

    public String getValue() {
        return brand;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}