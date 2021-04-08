package structural.decorator;

public class GofBook implements Book {
    @Override
    public void read() {
        System.out.println("I'm reading GOF");
    }
}
