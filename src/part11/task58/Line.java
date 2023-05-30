package part11.task58;


import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Line {
    private final CopyOnWriteArrayList<Integer> elements;
    public int counter;
    public static boolean isContinued = true;
    public Line(int volume) {
        this.elements = new CopyOnWriteArrayList<>();
        setLine(volume);
    }
    public synchronized void addPiece(String nameThread, int n) {
        while (elements.size() >= n) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        elements.add(getRandomNumber());
        System.out.println(this + " : " + nameThread);
        sleep(100);

        notifyAll();
    }

    public synchronized void takePiece(String nameThread, int n, int count) {
        if(elements.size() == 0) {
            System.out.println("line is empty!");
            System.exit(1);
        }
        while (elements.size() <= n) {
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter++;
        if (counter > count) {
            isContinued = false;
            System.exit(0);
        }
        elements.remove(0);
        System.out.println(this + " : " + nameThread + " : " + counter);
        sleep(100);
        notifyAll();
    }

    private int getRandomNumber() {
        return (int) (new Random().nextDouble() * 100 +1);
    }

    private void setLine(int volume) {
        if(volume < 1) {
            System.out.println("Line is empty, check volume");
            System.exit(1);
        }
        for (int i = 0; i < volume; i++) {
            elements.add(getRandomNumber());
        }
    }
    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return elements.toString();
    }

}
