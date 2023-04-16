package part7;



public class Task28 {
    public static void main(String[] args) {
        String text = "    Hello, world! My    name is Vadim!    ";
        if (text.trim().compareTo("") == 0) {
            System.out.println("Общее количество слов в тексте:  0");
        } else {
            String[] arr = text.trim().split("[\\s]+");
            System.out.println("Общее количество слов в тексте: " + arr.length);
        }
    }
}
