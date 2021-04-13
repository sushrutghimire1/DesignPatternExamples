package structural.bridge;

public class Bus extends VehicleImpl {
    public Bus(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void drive() {
        System.out.println("Driving Bus");
        workshop1.work();
        workshop2.work();
    }
}
