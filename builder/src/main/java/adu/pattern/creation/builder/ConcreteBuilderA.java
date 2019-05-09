package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public final class ConcreteBuilderA implements BuildElementA, BuildElementB{
    private String elementA;
    private String elementB;

    private ConcreteBuilderA() {
    }

    public static ConcreteBuilderA create() {
        return new ConcreteBuilderA();
    }

    @Override
    public ConcreteBuilderA elementA(String elementA) {
        this.elementA = elementA;
        return this;
    }

    @Override
    public ConcreteBuilderA elementB(String elementB) {
        this.elementB = elementB;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setElementA(elementA);
        product.setElementB(elementB);
        return product;
    }
}
