package behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        Container container1 = new Container(new AdditionStrategy());
        System.out.println(container1.performStrategy(2, 3));
        Container container2 = new Container(new SubtractionStrategy());
        System.out.println(container2.performStrategy(8, 3));
    }
}
