package creational.abstrac.factory;

import creational.abstrac.factory.factory.AbstractFactory;
import creational.abstrac.factory.factory.Brand;
import creational.abstrac.factory.factory.FactoryProducer;
import creational.abstrac.factory.product.AbstractProduct;

public class Client {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        AbstractFactory factory = factoryProducer.getFactory(Brand.A);
        AbstractProduct productA = factory.manufactureProductA();
        AbstractProduct productB = factory.manufactureProductB();
    }
}
