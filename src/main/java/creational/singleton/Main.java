package creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonDb singletonDb = SingletonDb.getInstance();
        singletonDb.getMessage();

    }
}
