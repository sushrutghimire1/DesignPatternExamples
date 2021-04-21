package creational.prototype;

import java.util.HashMap;

public class CarPrototypeFactory {
    private static final java.util.Map<String, CarPrototype> prototypes = new HashMap<>();

    static {
        prototypes.put(ModelType.BMW, new BMWCar());
        prototypes.put(ModelType.PORSCHE, new PorscheCar());
    }

    public static CarPrototype getInstance(final String s) throws CloneNotSupportedException {
        return (prototypes.get(s)).clone();
    }

    public static void loadCache() {
        CarPrototype prototype1 = new BMWCar();
        prototypes.put(ModelType.BMW,prototype1);
        CarPrototype prototype2 = new PorscheCar();
        prototypes.put(ModelType.PORSCHE,prototype2);
    }

    public static class ModelType {
        public static final String BMW = "bmw";
        public static final String PORSCHE = "porsche";
    }
}
