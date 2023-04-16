package part7;

public class Task31 {
    public static void main(String[] args) {

        String str = "<тег>метод <p id=p1> <тег>поиска</тег> тегов</тег>";

        System.out.println(str.replaceAll("<.*?>", "<p>"));
    }
}
