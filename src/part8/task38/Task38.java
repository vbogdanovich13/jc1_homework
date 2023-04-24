package part8.task38;
import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        while (true) {
            printMenu();
            readMenu();
        }

    }
    static void printMenu() {
        for (int i = 1; i < 5; ) {
            for (SeasonsYear s : SeasonsYear.values()) {
                System.out.println(i + ". " + s);
                i++;
            }
        }
        System.out.println("Чтобы узнать количество дней в сезоне, введите его порядковый номер.");
    }
    static void readMenu(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "Количество дней в сезоне: ";
        switch (num) {
            case 1:
                System.out.println(str + SeasonsYear.WINTER.getCountOfDays());
                break;
            case 2:
                System.out.println(str + SeasonsYear.SPRING.getCountOfDays());
                break;
            case 3:
                System.out.println(str + SeasonsYear.SUMMER.getCountOfDays());
                break;
            case 4:
                System.out.println(str + SeasonsYear.AUTUMN.getCountOfDays());
                break;
            default:
                System.out.println("Сезона года под таким номером не существует.");
        }
        System.out.println("");
    }
}
