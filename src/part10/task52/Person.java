package part10.task52;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
   private String surname;
    int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Age: " + age;
    }
}
