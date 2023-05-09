package part9.task42;

import java.util.ArrayList;
import java.util.Iterator;

public class Task42 {
    public static void main(String[] args) {
        int amount = 5;
        int bad = 3;
        ArrayList<Integer> estimates = new ArrayList<Integer>();
        for (int i = 0; i < amount; i++) {
            int a = (int) (Math.random() * 10 + 1);
            estimates.add(i, a);
        }
        System.out.println(estimates);
        int max = estimates.get(0);
        Iterator<Integer> iterator = estimates.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i > max) {
                max = i;
            }

        }
        System.out.println("Самая высокая оценка: " + max);

    }
}
