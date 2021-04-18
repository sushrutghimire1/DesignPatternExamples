package behavioural.mediator;

public class PowerSupplier {
    private ElectricityMediator mediator;

    public PowerSupplier() {
        mediator = new ElectricityMediator(this);
    }

    public void turnOn() {
        System.out.println("Power turned on");
    }

    public void turnOff() {
        System.out.println("Power turned off");
    }
}
