package part7;

public class Task32 {
    public static void main(String[] args) {
        long firstStartTime = System.nanoTime();
        String str1 = "aaabbbccc";

        for (int i = 0; i < 1000000; i++) {
            str1 += "aaabbbccc";
        }
        long firstPerformance = System.nanoTime() - firstStartTime;



        long secondStartTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder("aaabbbccc");
        for (int i = 0; i < 1000000; i++) {
            stringBuilder = stringBuilder.append("aaabbbccc");
        }
        long secondPerformance = System.nanoTime() - secondStartTime;
        System.out.println("Сложение строк с помощью StringBuilder быстрее в " +  firstPerformance / secondPerformance + " раз/раза, чем оператор сложения строк в String.");
    }
}
