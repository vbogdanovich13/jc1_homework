package part4.task14;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Task14 {
    public static void main(String[] args) {
        BigInteger s = BigInteger.ONE;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger exit = new BigInteger("26");

        do {
            s = s.multiply(a);
            a = a.add(b);
        } while (!a.equals(exit));
        System.out.println("Произведение чисел от 1 до 25 равно: " + s);
    }
}
