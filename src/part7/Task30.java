package part7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {
        String str = "0x7FFF 15166 0x7AAF 111  0  wafwqf";

        Pattern p = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        String[] words = str.split(" ");
        for(String word : words) {
            Matcher m = p.matcher(word);
           if(m.find()) {
               System.out.println(word);
           }
        }
    }
}
