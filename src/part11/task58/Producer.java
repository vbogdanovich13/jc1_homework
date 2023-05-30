package part11.task58;

public class Producer implements Runnable{
    private final Thread thread;
    private final Line line;

    public Producer(String threadName, Line line) {
        this.thread = new Thread(this,threadName);
        this.line = line;
        this.thread.start();
    }

    @Override
    public void run() {
        while (Line.isContinued) {
            line.addPiece(thread.getName(),100);
        }
    }
}
