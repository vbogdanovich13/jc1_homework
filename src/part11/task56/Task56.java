package part11.task56;

public class Task56 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            NewThread newThread = new NewThread();
            newThread.start();
        }

    }
}

class NewThread extends Thread{
    private static int count = 1;

    @Override
    public void run() {
        try {
            createTreadName();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static synchronized void createTreadName() throws InterruptedException {
        System.out.println("Thread name: Thread-" + count);
        count++;
        Thread.sleep(2000);
    }
}
