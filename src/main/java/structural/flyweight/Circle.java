package structural.flyweight;

import structural.facade.Shape;

public class Circle implements Shape {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle of color: " + color);
    }
}
