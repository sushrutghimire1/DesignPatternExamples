package behavioural.mediator;

public class Button {

    private final ElectricityMediator mediator;

    public Button() {
        this.mediator = new ElectricityMediator(this);
    }

    public void press() {
        mediator.press();
    }
}
