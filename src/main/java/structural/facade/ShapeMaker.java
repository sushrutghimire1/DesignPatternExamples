package structural.facade;

public class ShapeMaker {
    private final Shape circle;
    private final Shape square;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
