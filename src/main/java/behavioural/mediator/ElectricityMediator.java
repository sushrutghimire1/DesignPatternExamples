package behavioural.mediator;

public class ElectricityMediator {
    private static Fan fan;
    private static Button button;
    private static PowerSupplier powerSupplier;

    public ElectricityMediator(Fan fan) {
        ElectricityMediator.fan = fan;
    }

    public ElectricityMediator(PowerSupplier powerSupplier) {
        ElectricityMediator.powerSupplier = powerSupplier;
    }

    public ElectricityMediator(Button button) {
        ElectricityMediator.button = button;
    }

    public void press() {
        if (fan == null) {
            fan = new Fan();
        }
        if (fan.isOn) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        if (powerSupplier == null)
            powerSupplier = new PowerSupplier();
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}
