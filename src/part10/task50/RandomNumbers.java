package part10.task50;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RandomNumbers {
    private String name;
    int number;
    List<Integer> list = new ArrayList<>(20);

    public RandomNumbers(String name) {
        this.name = name;
    }
    void writeFile(){
        try (DataOutputStream numbersOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(name)))){

            for (int i = 0; i < 20; i ++){
                number = (int) (Math.random() * 10 + 1);
                numbersOut.writeInt(number);
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("input/output exception");
        }
    }

    void readFile() {
        try (DataInputStream numbersIn = new DataInputStream(new BufferedInputStream(new FileInputStream(name)))){

            for (int i = 0; i < 20; i ++){
                list.add(numbersIn.readInt());
                System.out.print(list.get(i) + " ");
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("input/output exception.");
        }

    }

    double average(){
        try {
            int sum = 0;
            int count = 0;

            for (int i = 0; i < list.size(); i ++){
                sum = sum + list.get(i);
                count++;
            }
            return (double) sum/count;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
            return -1;
        }
    }
}
