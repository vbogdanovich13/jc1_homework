package part12.task62;

import java.util.stream.IntStream;

public class Task62 {
    public static void main(String[] args) {
        double sum = IntStream.rangeClosed(1, 20)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println(i + " inches"))
                .mapToDouble(i -> i * 2.54)
                .sum();
        System.out.println("the sum is " + sum + "cm");
    }
}
