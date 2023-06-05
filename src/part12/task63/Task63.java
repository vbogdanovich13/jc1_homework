package part12.task63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task63 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String name = "Ivan-" + random.nextInt(100);
            String surname = "Petrov-" + random.nextInt(100);
            int age = 15 + random.nextInt(16);
            persons.add(new Person(name, surname, age));
        }

        List<String> surnames = persons.stream()
                .filter(per -> per.age < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing((Person per) -> per.surname).thenComparing(per -> per.name))
                .limit(4)
                .map(per -> per.surname)
                .collect(Collectors.toList());
        System.out.println(surnames);
    }


}
