package part3.task11;

public class Task11 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 3;
        int d = 3;
        int e = 10;
        int f = 13;


        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("Помещаются 2 дома");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("Помещаются 2 дома");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("Помещаются 2 дома");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("Помещаются 2 дома");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("Помещаются 2 дома");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("Помещаются 2 дома");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("Помещаются 2 дома");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("Помещаются 2 дома");
        } else System.out.println("Дома не помещаются");
    }

}
