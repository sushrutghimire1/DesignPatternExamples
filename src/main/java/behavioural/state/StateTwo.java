package behavioural.state;

public class StateTwo implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("This is state two");
        context.setState(this);
    }
}
