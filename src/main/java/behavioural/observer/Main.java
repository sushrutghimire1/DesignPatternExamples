package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        new SubscriberOne(publisher);
        new SubscriberTwo(publisher);
        System.out.println("First state change: 15");
        publisher.setState(15);
        System.out.println("Second state change: 10");
        publisher.setState(10);
    }
}
