package part11.task53;

public class Task53 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            MyThread myThread = new MyThread();
            myThread.setName("Thread №" + i);
            System.out.println(myThread.getName());
            myThread.start();
            myThread.join();
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        List10 list10 = new List10();
        list10.writeArrayList();
        System.out.println("Average value: " + list10.average());
        System.out.println();
    }
}
