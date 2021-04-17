package behavioural.observer;

public abstract class Subscriber {

    protected Publisher publisher;

    public abstract void update();

}
