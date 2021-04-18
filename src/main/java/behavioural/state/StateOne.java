package behavioural.state;

public class StateOne implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("This is state one");
        context.setState(this);
    }
}
