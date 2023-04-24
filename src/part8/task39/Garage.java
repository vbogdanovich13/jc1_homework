package part8.task39;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Garage<T extends Vehicle> {

    private final List<T> vehicles;

    public Garage() {
        vehicles = new ArrayList <>();
    }

    public void addAll(List<? extends T> list) {
        vehicles.addAll(list);
    }
    public void forEach(Consumer<? super T> consumer) {
        for (T vehicle : vehicles) {
            consumer.accept(vehicle);
        }
    }


}
