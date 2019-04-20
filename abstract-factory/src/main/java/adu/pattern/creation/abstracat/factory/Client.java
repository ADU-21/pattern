package adu.pattern.creation.abstracat.factory;

/**
 * @author adu
 */
public class Client {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory factory = factoryProducer.getFactory(Brand.A);
        AbstractProduct productA = factory.manufactureProductA();
        AbstractProduct productB = factory.manufactureProductB();

        System.out.println(productA);
        System.out.println(productB);
    }
}
