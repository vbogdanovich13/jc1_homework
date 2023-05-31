package part11.task61;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.concurrent.Callable;
public class Task61 implements Callable<String> {
    @Override
    public String call() {
        String str = null;
        try {
            str = writeFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName() + " : " + str;
    }

    private synchronized String writeFile() {
        String text = "Hello world" + " " + getCurrentTime() + "\n";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("task61-HelloWorld.txt",true))) {
            writer.write(text);
            Thread.sleep(1000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return text;
    }

    public String getCurrentTime() {
        return LocalTime.now().toString();
    }
}
