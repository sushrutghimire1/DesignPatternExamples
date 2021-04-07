package creational.abstractfactory;

public class BlackBagFactory extends AbstractBagFactory {
    @Override
    public Bag getBagObject(String bagType) {
        if (bagType.equals(BagTypes.BLACKWILSON.toString()))
            return new BlackGucciBag();
        if (bagType.equals(BagTypes.BLACKGUCCI.toString()))
            return new BlackWilsonBag();
        return null;
    }
}
