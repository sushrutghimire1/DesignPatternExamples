package structural.flyweight;

public class Main {
    private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 5; ++i) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
}
