package part4.task14;

public class Task14 {
    public static void main(String[] args) {
        long s = 1L;
        int i = 1;
        do {
            s *= i;
            i++;
        } while (i >= 1 && i <= 25);
        System.out.println("Произведение чисел от 1 до 25 равно: " + s);
    }
}
