package creational.singleton;

public class SingletonDb {
    private static SingletonDb singleton;

    private SingletonDb() {
    }

    public static SingletonDb getInstance() {
        if (singleton == null) {
            singleton = new SingletonDb();
        }
        return singleton;
    }

    public void getMessage() {
        System.out.println("Hello World");
    }
}
