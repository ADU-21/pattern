package adu.pattern.creation.factory.method;

/**
 * @author adu
 * @data 2019/5/10
 */
public class ProductA extends Product {
    @Override
    String show() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "ProductA{}";
    }
}
