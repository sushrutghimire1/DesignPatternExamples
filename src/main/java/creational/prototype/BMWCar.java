package creational.prototype;

public class BMWCar implements CarPrototype {

    @Override
    public String getCarName() {
        return "BMW";
    }

    @Override
    public CarPrototype clone() throws CloneNotSupportedException {
        System.out.println("Cloning BMW object..");
        return (BMWCar) super.clone();
    }
}
