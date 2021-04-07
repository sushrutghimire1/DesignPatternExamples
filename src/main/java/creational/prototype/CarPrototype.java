package creational.prototype;

public interface CarPrototype extends Cloneable {
    CarPrototype clone() throws CloneNotSupportedException;

    String getCarName();
}
