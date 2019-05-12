package adu.pattern.creation.factory.kit;

/**
 * @author adu
 * @data 2019/5/12
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = Factory.init(builder -> {
            builder.add(ProductType.A, ProductA::new);
            builder.add(ProductType.B, ProductB::new);
            builder.add(ProductType.C, ProductC::new);
        });

        Product product = factory.create(ProductType.B);
        System.out.println(product);
    }
}
