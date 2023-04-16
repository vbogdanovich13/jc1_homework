package part7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        String str = "Тестовая строка, строка, с несколькими,, <запятыми";
        int n = 0;
        Matcher m;
        Pattern punct = Pattern.compile("\\p{Punct}");
        String[] arrayText = str.split("\\s");
        for(String s : arrayText) {
            m = punct.matcher(s);
            while (m.find()) {
                n++;
            }
        }
        System.out.println("Количество знаков препинания: " + n);
     }
}

