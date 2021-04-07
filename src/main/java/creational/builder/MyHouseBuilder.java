package creational.builder;

public class MyHouseBuilder implements HouseBuilder {
    private final MyHouse myHouse;


    public MyHouseBuilder() {
        myHouse = new MyHouse();
    }


    @Override
    public MyHouseBuilder buildBasement() {
        System.out.println("Basement built");
        myHouse.setBasementNeeded(true);
        return this;
    }

    @Override
    public MyHouseBuilder buildGarden() {
        System.out.println("Garden built");
        myHouse.setGardenNeeded(true);
        return this;
    }

    @Override
    public MyHouseBuilder buildRoof(int roofSize) {
        System.out.println("Roof built");
        myHouse.setRoofNeeded(true);
        myHouse.setSizeOfRoof(roofSize);
        return this;
    }

    @Override
    public MyHouse build() {
        return myHouse;
    }
}
