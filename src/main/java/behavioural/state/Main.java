package behavioural.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        StateOne startState = new StateOne();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StateTwo stopState = new StateTwo();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
