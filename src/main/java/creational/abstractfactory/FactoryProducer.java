package creational.abstractfactory;

public class FactoryProducer {

    public static AbstractBagFactory getFactory(boolean red) {
        if (red)
            return new RedBagFactory();
        else
            return new BlackBagFactory();
    }

}

