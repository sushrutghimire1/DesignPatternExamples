package behavioural.observer;

public class SubscriberTwo extends Subscriber {
    public SubscriberTwo(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.addSubscriber(this);
    }

    @Override
    public void update() {
        System.out.println("Message for Subscriber 2: " + publisher.getState());
    }
}
