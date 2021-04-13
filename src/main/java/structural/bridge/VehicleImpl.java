package structural.bridge;

abstract class VehicleImpl implements Vehicle {

    protected Workshop workshop1;
    protected Workshop workshop2;

    public VehicleImpl(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    @Override
    abstract public void drive();
}
