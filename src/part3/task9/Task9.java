package part3.task9;

public class Task9 {
    public static void main(String[] args) {
        int sum = 2750;
        if (sum % 10 == 0 | sum % 10 == 5 | sum % 10 == 6 | sum % 10 == 7 | sum % 10 == 8 | sum % 10 == 9) {
            System.out.println(sum + " рублей");
        } else if (sum % 10 == 1) {
            System.out.println(sum + " рубль");
        } else if (sum % 10 == 2 | sum % 10 == 3 | sum % 10 == 4) {
            System.out.println(sum + " рубля");
        }
    }
}
