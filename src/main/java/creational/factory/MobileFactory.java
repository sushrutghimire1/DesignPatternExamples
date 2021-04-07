package creational.factory;

public class MobileFactory {

    public static Mobile getMobile(String mobileName) {
        if (mobileName == null)
            return null;
        if (mobileName.equals(MobileNames.ONEPLUS.toString())) {
            return new OnePlusMobile();
        }

        if (mobileName.equals(MobileNames.SAMSUNG.toString())) {
            return new SamsungMobile();
        }

        return null;

    }

}
