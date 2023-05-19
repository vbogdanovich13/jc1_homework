package part10.task49;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task49 {
    public static void main(String[] args) throws IOException {
        File file = new File("src//part10//task49//testFile2.txt");
        if (file.createNewFile()) {
            System.out.println("File is created");
        } else {
            System.out.println("File already exists.");
        }
        FileWriter writer = new FileWriter(file);
        writer.write(" 5 6 8 9 9 6 We have to buy the following things: bread, butter, milk, a cake. 5 6 8 9 9 6");
        writer.close();
        FileInputStream fileInputStream = new FileInputStream("src//part10//task49//testFile2.txt");
        byte[] bytesArray = new byte[(int) file.length()];
        fileInputStream.read(bytesArray);
        String s = new String(bytesArray);


        Pattern pattern = Pattern.compile("\\b[\\d]+\\b");
        Matcher matcher = pattern.matcher(s);

        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        System.out.println("Найденные цифры в тексе: " + numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех найденных чисел равна: " + sum);
        Set<Integer> set = new LinkedHashSet<>(numbers);
        numbers.clear();
        numbers.addAll(set);
        System.out.println("Все найденные числа, за исключением повторяющихся: " + numbers);

    }

}
