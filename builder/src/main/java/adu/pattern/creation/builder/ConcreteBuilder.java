package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public final class ConcreteBuilder implements Builder{
    private String elementA;
    private String elementB;
    private String elementC;

    private ConcreteBuilder() {
    }

    public static ConcreteBuilder create() {
        return new ConcreteBuilder();
    }

    @Override
    public ConcreteBuilder elementA(String elementA) {
        this.elementA = elementA;
        return this;
    }

    @Override
    public ConcreteBuilder elementB(String elementB) {
        this.elementB = elementB;
        return this;
    }

    @Override
    public ConcreteBuilder elementC(String elementC) {
        this.elementC = elementC;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setElementA(elementA);
        product.setElementB(elementB);
        product.setElementC(elementC);
        return product;
    }
}
