package part5.task20;

import java.util.Random;

public class Task20 {
    public static void main(String[] args) {
        int[] a = new int [10];
        for (int i = 0; i < a.length; i++ ) {
            a[i] = i + 1;
            if (i % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
