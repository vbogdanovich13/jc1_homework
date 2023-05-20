package part10.task52;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Task52 {
    public static void main(String[] args) {
        int countPerson = 10;
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < countPerson; i++) {
            int a = (int) (Math.random() * 30 + 1);
            Person person = new Person("name" + (i + 1), "surname" + (i + 1), a);
            persons.add(person);

        }
        System.out.println("Созданный список с людьми:");
        persons.forEach(System.out::println);
        try {
            FileOutputStream fos = new FileOutputStream(new File("src/part10/task52/persons.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Person people : persons) {
                oos.writeObject(people);
            }
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
