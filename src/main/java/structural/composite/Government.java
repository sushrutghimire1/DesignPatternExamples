package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Government {
    private final String name;
    private final List<Government> subordinates;

    public Government(String name) {
        this.name = name;
        subordinates = new ArrayList<>();
    }

    public void add(Government e) {
        subordinates.add(e);
    }

    public void remove(Government e) {
        subordinates.remove(e);
    }

    public List<Government> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Government{" +
                "name='" + name + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }
}
