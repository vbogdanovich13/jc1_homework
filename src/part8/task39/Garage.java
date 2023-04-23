package part8.task39;

public class Garage <T extends Vehicle, M extends Vehicle>{
    private T vehicle;

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public M getVehicle2() {
        return vehicle2;
    }

    public void setVehicle2(M vehicle2) {
        this.vehicle2 = vehicle2;
    }

    private M vehicle2;


}
