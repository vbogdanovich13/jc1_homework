package part8.task37;


import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        System.out.println("Введите порядковый номер сезона года.");
        for (int i = 1; i < 5; ) {
            for (SeasonsYear s : SeasonsYear.values()) {
                System.out.println(i + ". " + s);
                i++;
            }
        }


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Следующим сезоном от заданного будет: " + SeasonsYear.SPRING);
                break;
            case 2:
                System.out.println("Следующим сезоном от заданного будет: " + SeasonsYear.SUMMER);
                break;
            case 3:
                System.out.println("Следующим сезоном от заданного будет: " + SeasonsYear.AUTUMN);
                break;
            case 4:
                System.out.println("Следующим сезоном от заданного будет: " + SeasonsYear.WINTER);
                break;
            default:
                System.out.println("Сезона года под таким номером не существует.");
        }

    }


}
