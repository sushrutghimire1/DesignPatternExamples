package creational.builder;

public class House {
    protected final boolean roofNeeded;
    protected final int sizeOfRoof;

    public House(HouseBuilder builder) {
        this.roofNeeded = builder.roofNeeded;
        this.sizeOfRoof = builder.sizeOfRoof;
    }

    public boolean isRoofNeeded() {
        return roofNeeded;
    }

    public int getSizeOfRoof() {
        return sizeOfRoof;
    }

}
