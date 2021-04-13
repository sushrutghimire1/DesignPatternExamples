package structural.bridge;

public class Car extends VehicleImpl {
    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void drive() {
        System.out.println("Driving car");
        workshop1.work();
        workshop2.work();
    }
}
