package part11.task55;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task55 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            NewThread newThread = new NewThread();
            newThread.start();
            Thread.sleep(1000);
        }

    }

}

class NewThread extends Thread {
    private int[] array = new int[10];
    private static int count = 1;

    @Override
    public void run() {

        try (DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream
                (new FileOutputStream("random_numbers" + count)))) {
            createArray();
            createFile(dataOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        count++;
    }

    private void createArray() {
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 20 + 1);

        }
    }

    private void createFile(DataOutputStream dataOut) throws IOException {
        for (int i = 0; i < 10; i++) {
            dataOut.writeInt(array[i]);
        }
    }

}
