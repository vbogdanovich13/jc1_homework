package part11.task58;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(200);
        System.out.println(line);
        new Producer("Producer №1", line);
        new Producer("Producer №2", line);
        new Producer("Producer №3", line);
        new Consumer("Consumer №1", line);
        new Producer("Consumer №2", line);

    }

}
