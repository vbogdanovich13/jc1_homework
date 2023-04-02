package part3.task7;

public class Task7 {
    public static void main(String[] args) {
        int a = 1007;

        if (isNumberEndsWithSeven(a)) {
            System.out.println("Последняя цифра числа " + a + " является семеркой");
        } else {
            System.out.println("Последняя цифра числа " + a + " не является семеркой");
        }
    }

    public static boolean isNumberEndsWithSeven(int a) {
        return a % 10 == 7;
    }

}
