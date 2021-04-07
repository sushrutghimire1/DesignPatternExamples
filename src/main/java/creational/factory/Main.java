package creational.factory;

public class Main {

    public static void main(String[] args) {
        Mobile samsungMobile = MobileFactory.getMobile(MobileNames.SAMSUNG.toString());
        System.out.println(samsungMobile.getName());
        Mobile onePlusMobile = MobileFactory.getMobile(MobileNames.ONEPLUS.toString());
        System.out.println(onePlusMobile.getName());
    }
}
