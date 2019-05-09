package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public class ConcreteBuilderB implements Builder{
    private ProductB productB;

    @Override
    public void reset() {
        this.productB = new ProductB();
    }

    @Override
    public void elementA(String elementA) {
        this.productB.setElementA(elementA);
    }

    @Override
    public void elementB(String elementB) {
        this.productB.setElementB(elementB);
    }

    @Override
    public void elementC(String elementC) {
        this.productB.setElementC(elementC);
    }

    public ProductB getProductB() {
        return this.productB;
    }
}
