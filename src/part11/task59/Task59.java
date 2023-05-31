package part11.task59;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task59 implements  Callable<HashMap<CopyOnWriteArrayList<String>,String>> {

    private final CopyOnWriteArrayList<String> list;
    private static int count;
    private final String[] text = {
            "white","black","red","yellow","orange",
            "green","blue","purple","grey", "brown"
    };

    public Task59() {
        this.list = new CopyOnWriteArrayList<>();
    }

    private int randomNumber() {
        return (int)(new Random().nextDouble()*10);
    }

    private String createString() {
        int numberOfElements = randomNumber();
        if(numberOfElements == 0) return "tab";
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < numberOfElements; i++) {
            str.append(text[randomNumber()]).append(" ");
        }
        return str.toString();
    }

    private HashMap<CopyOnWriteArrayList<String>,String> writeFile() {
        HashMap<CopyOnWriteArrayList<String>,String> listNameThread = new HashMap<>();
        if(new File("folder_for_task59").mkdir()) {
            System.out.println("folder is created");
        }
        for (int i = 0; i < 10; i++) {
            String fileName = "file-" + (++count) + ".txt";
            list.add(fileName);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("folder_for_task59/" + fileName))) {
                for (int j = 0; j < 10; j++) writer.write(createString() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        sleep(1000,3000);
        listNameThread.put(list,Thread.currentThread().getName());
        return listNameThread;
    }

    private void sleep(int a, int b) {
        try {
            Thread.sleep((long)(Math.random()*(b-a)+a));
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public HashMap<CopyOnWriteArrayList<String>,String> call() {
        return writeFile();
    }

}


