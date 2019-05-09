package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public class Director {
    public Product constructA() {
        return ConcreteBuilderA.create()
            .elementA("elementA")
            .elementB("elementB")
            .build();
    }

    public Product constructB() {
        return ConcreteBuilderB.create()
            .elementB("elementB")
            .elementC("elementC")
            .build();
    }
}
