package part5.task21;

public class Task21 {
    public static void main(String[] args) {
        int[] a = {20, 12, 15, 22, 14, 4, 85, 42, 33, 53};
        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (a[i] >= max) {
                index = i;
            }
        }
        System.out.println(index);
    }
}
