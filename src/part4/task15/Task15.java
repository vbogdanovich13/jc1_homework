package part4.task15;

public class Task15 {
    public static void main(String[] args) {
        long n = 7893823445L;
        int sum = 0;
        do {
            sum += (n % 10);
            n /= 10;
        } while (n != 0);
        System.out.println("Сумма цифр введенного числа равна " + sum);

    }
}
