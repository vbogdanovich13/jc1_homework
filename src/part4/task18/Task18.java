package part4.task18;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();

        Locale.setDefault(Locale.FRANCE);
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        System.out.println(decimalFormat.format(i));
    }
}
