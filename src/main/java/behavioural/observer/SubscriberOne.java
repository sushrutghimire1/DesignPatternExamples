package behavioural.observer;

public class SubscriberOne extends Subscriber {

    public SubscriberOne(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.addSubscriber(this);
    }

    @Override
    public void update() {
        System.out.println("Message for Subscriber 1: " + publisher.getState());
    }
}
