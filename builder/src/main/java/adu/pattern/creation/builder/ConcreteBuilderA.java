package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public class ConcreteBuilderA implements Builder{
    private ProductA productA;

    @Override
    public void reset() {
        this.productA = new ProductA();
    }

    @Override
    public void elementA(String elementA) {
        this.productA.setElementA(elementA);
    }

    @Override
    public void elementB(String elementB) {
        this.productA.setElementB(elementB);
    }

    @Override
    public void elementC(String elementC) {
        this.productA.setElementC(elementC);
    }

    public ProductA getProductA() {
        return this.productA;
    }
}
