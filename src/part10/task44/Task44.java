package part10.task44;

public class Task44 {
    public static void main(String[] args) {
        Integer num = null;

        try {
            System.out.println(num.toString());

        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("Переменная не указывает ни на какой существующий объект.");

        }

    }

}
