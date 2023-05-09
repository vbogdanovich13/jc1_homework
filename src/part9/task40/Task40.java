package part9.task40;

import java.util.ArrayList;
import java.util.Iterator;

public class Task40 {
    public static void main(String[] args) {
        int amount = 5;
        int bad = 3;
        ArrayList<Integer> estimates = new ArrayList<Integer>();
        for (int i = 0; i < amount; i++) {
            int a = (int) (Math.random() * 10 + 1);
            estimates.add(i, a);
        }
        System.out.println(estimates);
        int max = 0;
        Iterator<Integer> iterator = estimates.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        System.out.println(max);
    }
}
