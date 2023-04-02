package part3.task10;

public class Task10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 11;
        int c = 1989;

        if ((a == 28 && b == 2 && c % 4 == 0 && c % 100 != 0 || c % 400 == 0)) {
            System.out.println("29.02." + c);
        } else if (a >= 1 && a <= 27) {
            System.out.print((a = a + 1) + "." + b + "." + c);
        } else if (a == 31 && b == 12) {
            System.out.print("01.01." + (c = c + 1));
        } else if (a == 31 && b == 1) {
            System.out.print("01.02." + c);
        } else if (a == 28 && b == 2) {
            System.out.print("01.03." + c);
        } else if (a == 31 && b == 3) {
            System.out.print("01.04." + c);
        } else if (a == 30 && b == 4) {
            System.out.print("01.05." + c);
        } else if (a == 31 && b == 5) {
            System.out.print("01.06." + c);
        } else if (a == 30 && b == 6) {
            System.out.print("01.07." + c);
        } else if (a == 31 && b == 7) {
            System.out.print("01.08." + c);
        } else if (a == 31 && b == 8) {
            System.out.print("01.09." + c);
        } else if (a == 30 && b == 9) {
            System.out.print("01.10." + c);
        } else if (a == 31 && b == 10) {
            System.out.print("01.11." + c);
        } else if (a == 30 && b == 11) {
            System.out.print("01.12." + c);
        }
    }
}
