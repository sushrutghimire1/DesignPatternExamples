package behavioural.strategy;

public class Container {
    private final Strategy strategy;

    public Container(Strategy strategy) {
        this.strategy = strategy;
    }

    public int performStrategy(int num1, int num2) {
        return strategy.performStrategy(num1, num2);
    }
}
