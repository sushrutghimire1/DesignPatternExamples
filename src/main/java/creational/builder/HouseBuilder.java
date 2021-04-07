package creational.builder;

public interface HouseBuilder {
    MyHouseBuilder buildBasement();

    MyHouseBuilder buildGarden();

    MyHouseBuilder buildRoof(int roofSize);

    MyHouse build();

}
