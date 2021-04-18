package structural.composite;

public class Main {
    public static void main(String[] args) {
        Government government = new Government("Central");
        Government state = new Government("State");
        Government state2 = new Government("State");
        government.add(state);
        government.add(state2);
        System.out.println(government.toString());

    }
}
