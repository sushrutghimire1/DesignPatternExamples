package structural.bridge;

public class Producer implements Workshop {
    @Override
    public void work() {
        System.out.println("Producing work");
    }
}
