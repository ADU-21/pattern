package adu.pattern.creation.factory.method;

/**
 * @author adu
 * @data 2019/5/10
 */
public class Client {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.makeProduct();
        System.out.println(productA.show());

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.makeProduct();
        System.out.println(productB.show());
    }
}
