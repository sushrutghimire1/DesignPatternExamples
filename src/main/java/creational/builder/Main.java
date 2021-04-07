package creational.builder;

public class Main {


    public static void main(String[] args) {
        MyHouseBuilder myHouseBuilder = new MyHouseBuilder();
        MyHouse myHouse = myHouseBuilder.buildBasement().buildRoof(10).buildGarden().build();
        myHouse.getDetails();
    }
}
