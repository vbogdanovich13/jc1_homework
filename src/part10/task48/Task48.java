package part10.task48;

import java.io.*;

public class Task48 {
    public static void main(String[] args) throws IOException {
        File file = new File("src//part10//task48//testFile.txt");
        if (file.createNewFile()) {
            System.out.println("File is created");
        } else {
            System.out.println("File already exists.");
        }
        FileWriter writer = new FileWriter(file);
        writer.write("We have to buy the following things: bread, butter, milk, a cake.");
        writer.close();

        FileInputStream fileInputStream = new FileInputStream("src//part10//task48//testFile.txt");

        byte[] bytesArray = new byte[(int)file.length()];
        fileInputStream.read(bytesArray);
        String s = new String(bytesArray);
        String [] data = s.split("\\p{Punct}");
        int count = 0;
        for (int i = 0; i< data.length; i++) {
            count++;
        }
        System.out.println("Общее количество знаков препинания:  " + count);
        String[] arr = s.trim().split("[\\s]+");
        System.out.println("Общее количество слов в тексте: " + arr.length);

    }


}
