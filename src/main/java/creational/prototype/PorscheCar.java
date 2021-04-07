package creational.prototype;

public class PorscheCar implements CarPrototype {

    @Override
    public String getCarName() {
        return "Porsche";
    }


    @Override
    public CarPrototype clone() throws CloneNotSupportedException {
        System.out.println("Cloning Porsche object..");
        return (PorscheCar) super.clone();
    }
}
