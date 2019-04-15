package creational.abstrac.factory.factory;

/**
 * @author adu
 */
public class FactoryProducer {
    private static final FactoryA factoryA = new FactoryA();
    private static final FactoryB factoryB = new FactoryB();

    public AbstractFactory getFactory(Brand brand) {
        switch (brand) {
            case A:
                return factoryA;
            case B:
                return factoryB;
            default:
                throw new RuntimeException(String.format("Brand not exist, %s", brand));
        }

    }
}
