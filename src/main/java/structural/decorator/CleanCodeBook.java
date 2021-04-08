package structural.decorator;

public class CleanCodeBook implements Book {
    @Override
    public void read() {
        System.out.println("I'm reading Clean Code");
    }
}
