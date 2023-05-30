package part11.task54;

public class Task54 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            NewThread newThread = new NewThread();
            newThread.setName("Thread №" + i);
            System.out.println(newThread.getName());
            newThread.start();
            Thread.sleep(1000);
        }

    }

}

class NewThread extends Thread {
    private int[] array = new int[10];

    @Override
    public void run() {
        createArray();
        System.out.println("Maximum number: " + findMax());
        System.out.println();

    }

    private void createArray() {
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 30 + 1);
        }
    }

    private int findMax() {
        int max = array[0];
        for (int i = 1; i < 10; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}