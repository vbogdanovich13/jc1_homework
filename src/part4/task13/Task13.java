package part4.task13;

public class Task13 {
    public static void main(String[] args) {
        int i = 0;
        int f = 1;

        if (i == 0) {
            System.out.println("Факториал числа " + i + " равен " + 1);
            i++;
        }
        while (i <= 10 && i > 0) {
            f *= i;
            System.out.println("Факториал числа " + i + " равен " + f);
            i++;
        }
    }
}
