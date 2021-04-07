package creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractBagFactory blackBagFactory = FactoryProducer.getFactory(true);
        Bag redGucciBag = blackBagFactory.getBagObject(BagTypes.REDGUCCI.toString());
        Bag redWilsonBag = blackBagFactory.getBagObject(BagTypes.REDWILSON.toString());
        AbstractBagFactory redBagFactory = FactoryProducer.getFactory(false);
        Bag blackGucciBag = redBagFactory.getBagObject(BagTypes.BLACKGUCCI.toString());
        Bag blackWilsonBag = redBagFactory.getBagObject(BagTypes.BLACKWILSON.toString());
        System.out.println(redGucciBag.getBagName());
        System.out.println(redWilsonBag.getBagName());
        System.out.println(blackGucciBag.getBagName());
        System.out.println(blackWilsonBag.getBagName());
    }
}
