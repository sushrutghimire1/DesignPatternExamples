package behavioural.mediator;

public class Fan {
    public boolean isOn = false;
    private final ElectricityMediator mediator;

    public Fan() {
        this.mediator = new ElectricityMediator(this);
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }
}
