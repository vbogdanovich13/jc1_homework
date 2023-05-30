package part11.task53;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class List10 {
    private static List<Integer> list;

    public List10() {
        list = new CopyOnWriteArrayList<>();
    }

    protected synchronized void writeArrayList() {
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 10 + 1);
            list.add(i, a);
        }
    }

    private double sum;

    protected synchronized double average() {
        int count = 0;
        for (int a : list) {
            sum += a;
            count++;
        }
        return sum / count;
    }

}
