package part9.task43;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        String[] words = message.toLowerCase().replaceAll("\\p{Punct}", "").split("\\s");

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = wordsMap.get(word);
                if (count == null) {
                    count = 0;
                }
                wordsMap.put(word, ++count);
            }
        }


        System.out.println("<<Слово>> : <<количество его повторений в тексте>>");
        for (String word : wordsMap.keySet()) {

            System.out.println("<<" + word + ">>" + " : " + "<<" + wordsMap.get(word) + ">>");
        }
    }

}
