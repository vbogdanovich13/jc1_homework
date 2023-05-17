package part10.task46;

public class Task46 {
    public static void main(String[] args) throws NullPointerException {
        Integer n = null;
        try {
            readNull(n);
        } catch (NullPointerException e) {
            System.out.println("Переменная не указывает ни на какой объект.");
        }
    }


    public static void readNull(Integer a) throws NullPointerException {
        System.out.println(a.toString());
    }
}

