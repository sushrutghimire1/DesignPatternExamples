package behavioural.strategy;

public class SubtractionStrategy implements Strategy {
    @Override
    public int performStrategy(int num1, int num2) {
        return num1 - num2;
    }
}
