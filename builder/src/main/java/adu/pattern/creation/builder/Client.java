package adu.pattern.creation.builder;

/**
 * @author adu
 * @data 2019/4/21
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        ConcreteBuilderA builderA = new ConcreteBuilderA();
        director.constructA(builderA);
        ProductA productA = builderA.getProductA();

        ConcreteBuilderB builderB = new ConcreteBuilderB();
        director.constructB(builderB);
        ProductB productB = builderB.getProductB();

        System.out.println(productA);
        System.out.println(productB);
    }
}
