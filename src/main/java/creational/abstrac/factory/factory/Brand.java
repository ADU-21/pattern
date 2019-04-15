package creational.abstrac.factory.factory;

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

    @Override
    public String toString() {
        return "Brand{" +
            "brand='" + brand + '\'' +
            '}';
    }
}