package part12.task64;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task64 {
    public static void main(String[] args) {
        int n = 300;
        int minValue = 13;
        int maxValue = 1500;

        List<Integer> list = IntStream.rangeClosed(minValue, maxValue)
                .boxed()
                .limit(n)
                .collect(Collectors.toList());
        boolean divisibleByThreeOrFive = list.stream()
                .anyMatch(i -> i % 3 == 0 && i % 5 == 0);
        System.out.println(divisibleByThreeOrFive ? "В коллекции содержатся числа, которые делятся и на 3, и на 5." : "В коллекции не содержатся числа, которые делятся и на 3, и на 5.");
    }
}
