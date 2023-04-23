package part8.task39;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Garage<Car, Motorcycle> garage = new Garage<>();
        Car car = new Car("BMW");
        Motorcycle motorcycle = new Motorcycle("HONDA CBR");
        garage.setVehicle(car);
        garage.setVehicle2(motorcycle);
        System.out.println(motorcycle.getName());
        System.out.println(car.getName());
    }





}
