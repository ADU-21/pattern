package creational.abstrac.factory.factory;

/**
 * @author adu
 */
public class FactoryProducer {
    private static final FactoryA factoryA = new FactoryA();
    private static final FactoryB factoryB = new FactoryB();

    public AbstractFactory getFactory(Brand brand) {
        AbstractFactory factory = null;
        switch (brand) {
            case A:
                factory = factoryA;
                break;
            case B:
                factory = factoryB;
                break;
            default:
                break;
        }
        return factory;

    }
}
