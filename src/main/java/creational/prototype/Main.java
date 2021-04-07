package creational.prototype;

public class Main {
    public static void main(String[] args) {
        try {
            CarPrototype bmw = CarPrototypeFactory.getInstance(CarPrototypeFactory.ModelType.BMW);
            System.out.println(bmw.getCarName() + " called");
            CarPrototype porsche = CarPrototypeFactory.getInstance(CarPrototypeFactory.ModelType.PORSCHE);
            System.out.println(porsche.getCarName() + " called");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
