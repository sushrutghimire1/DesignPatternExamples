package creational.abstractfactory;

public class RedBagFactory extends AbstractBagFactory {
    @Override
    public Bag getBagObject(String bagType) {
        if (bagType.equals(BagTypes.REDGUCCI.toString()))
            return new RedGucciBag();
        if (bagType.equals(BagTypes.REDWILSON.toString()))
            return new RedWilsonBag();
        return null;
    }
}
