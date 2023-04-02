package part4.task16;

public class Task16 {
    public static void main(String[] args) {
        int min = 50;
        int max = 70;

        for (int i = 50, count = 0; i < 71; i++) {
            if (isPrime(i)) {
                count++;
                if (count == 2) {
                    System.out.println("Второе простое число из списка равно: " + i);
                    break;
                }
            }
        }

    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
