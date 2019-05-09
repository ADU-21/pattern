package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public final class ConcreteBuilderB implements BuildElementB, BuildElementC{
    private String elementB;
    private String elementC;

    private ConcreteBuilderB() {
    }

    public static ConcreteBuilderB create() {
        return new ConcreteBuilderB();
    }


    @Override
    public ConcreteBuilderB elementB(String elementB) {
        this.elementB = elementB;
        return this;
    }

    @Override
    public ConcreteBuilderB elementC(String elementC) {
        this.elementC = elementC;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setElementB(elementB);
        product.setElementC(elementC);
        return product;
    }
}
