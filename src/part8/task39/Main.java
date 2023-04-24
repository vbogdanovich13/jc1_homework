package part8.task39;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название автомобиля для постановки его в гараж.");
        String car1 = sc.nextLine();
        cars.add(new Car(car1));
        ArrayList<Motorcycle> motorcycles = new ArrayList<>();
        System.out.println("Введите название мотоцикла для постановки его в гараж.");
        String car2 = sc.nextLine();
        motorcycles.add(new Motorcycle(car2));
        Garage<Vehicle> garage = new Garage<>();
        garage.addAll(cars);
        garage.addAll(motorcycles);
        System.out.println("В гараже хранятся транспортные средства под названиями:");
        garage.forEach(car -> System.out.println(car.getName()));

    }


}
