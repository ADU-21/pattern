package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public class Director {

    public Product construct(String type) {
        Product product = null;
        switch (type) {
            case "default":
                product = ConcreteBuilder.create()
                    .elementA("elementA")
                    .elementB("elementB")
                    .elementC("elementC")
                    .build();
                break;
            default:
                break;

        }
        return product;
    }
}
