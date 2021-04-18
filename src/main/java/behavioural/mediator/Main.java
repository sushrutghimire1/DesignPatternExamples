package behavioural.mediator;

public class Main {
    public static void main(String[] args) {

        Fan fan = new Fan();
        System.out.println(fan.isOn);
        Button button = new Button();
        button.press();
        System.out.println(fan.isOn);
        button.press();
        System.out.println(fan.isOn);
    }
}
