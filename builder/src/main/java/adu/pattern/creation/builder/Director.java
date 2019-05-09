package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public class Director {
    public Product construct() {
        return ConcreteBuilder.create()
            .elementA("elementA")
            .elementB("elementB")
            .elementC("elementC")
            .build();
    }
}
