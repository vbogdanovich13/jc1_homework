package part2.task5;

public class SumTask5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        System.out.println(sum(a, b));
    }

    public static int sum(int a, int b) {
        int s = a + b + a * b;
        return s;
    }
}
