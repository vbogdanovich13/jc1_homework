package part11.task57;


public class DeadLock {


    private final Objects object1;
    private final Objects object2;
    private final Objects object3;

    public DeadLock() {
        this.object1 =  new Objects("object1");
        this.object2 =  new Objects("object2");
        this.object3 =  new Objects("object3");

        runThreads();
    }

    private void first() {
        synchronized (object1) {
            String str = Thread.currentThread().getName();
            System.out.println(str + " first synchronized object");
            synchronized (object2) {
                System.out.println(object2);
            }
        }
    }

    private void second() {
        synchronized (object2) {
            String str = Thread.currentThread().getName();
            System.out.println(str + " second synchronized object");
            synchronized (object1) {
                System.out.println(object1);
            }
        }
    }

    private void third() {
        synchronized (object3) {
            String str = Thread.currentThread().getName();
            System.out.println(str + " third synchronized object");
            synchronized (object2) {
                System.out.println(object2);
            }
        }
    }
    private void runThreads() {
        new Thread(() -> first()).start();
        new Thread(() -> second()).start();
        new Thread(() -> third()).start();
    }

}
