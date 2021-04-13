package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Workshop assembler = new Assembler();
        Workshop producer = new Producer();
        Vehicle car = new Car(producer, assembler);
        Vehicle bus = new Bus(producer, assembler);
        bus.drive();
        car.drive();
    }
}
