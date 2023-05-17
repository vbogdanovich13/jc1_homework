package part10.task45;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = Integer.parseInt(scanner.nextLine());
            if (a != 0) {
                throw new ScannerException("Пользователь ввел что-то кроме нуля.");
            }

        }
    }
}
