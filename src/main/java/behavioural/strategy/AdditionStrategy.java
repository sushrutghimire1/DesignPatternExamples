package behavioural.strategy;

public class AdditionStrategy implements Strategy {
    @Override
    public int performStrategy(int num1, int num2) {
        return num1 + num2;
    }
}
