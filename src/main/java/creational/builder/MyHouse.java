package creational.builder;

public class MyHouse {
    private boolean roofNeeded;
    private int sizeOfRoof;
    private boolean gardenNeeded;
    private boolean basementNeeded;

    public boolean isRoofNeeded() {
        return roofNeeded;
    }

    public void setRoofNeeded(boolean roofNeeded) {
        this.roofNeeded = roofNeeded;
    }

    public int getSizeOfRoof() {
        return sizeOfRoof;
    }

    public void setSizeOfRoof(int sizeOfRoof) {
        this.sizeOfRoof = sizeOfRoof;
    }

    public boolean isGardenNeeded() {
        return gardenNeeded;
    }

    public void setGardenNeeded(boolean gardenNeeded) {
        this.gardenNeeded = gardenNeeded;
    }

    public boolean isBasementNeeded() {
        return basementNeeded;
    }

    public void setBasementNeeded(boolean basementNeeded) {
        this.basementNeeded = basementNeeded;
    }

    public void getDetails() {
        System.out.println("Basement needed: " + isBasementNeeded());
        System.out.println("Garden needed:" + isGardenNeeded());
        System.out.println("Roof Needed: " + isRoofNeeded());
        System.out.println("Roof Size: " + getSizeOfRoof());
    }
}
