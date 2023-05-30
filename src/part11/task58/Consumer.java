package part11.task58;

public class Consumer implements Runnable {

    private final Thread thread;
    private final Line line;
    public Consumer(String threadName, Line line) {
        this.thread = new Thread(this, threadName);
        this.line = line;
        this.thread.start();
    }

    @Override
    public void run() {
        while (Line.isContinued) {
            line.takePiece(thread.getName(),80,10000);
        }
    }
}
