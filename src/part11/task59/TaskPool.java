package part11.task59;

import java.util.HashMap;
import java.util.concurrent.*;

public class TaskPool {
    public static void start(int numberOfThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        Future<HashMap<CopyOnWriteArrayList<String>,String>> task1 = executorService.submit(new Task59());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> task2 = executorService.submit(new Task59());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> task3 = executorService.submit(new Task59());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> task4 = executorService.submit(new Task59());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> task5 = executorService.submit(new Task59());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> task6 = executorService.submit(new Task59());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> task7 = executorService.submit(new Task59());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> task8 = executorService.submit(new Task59());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> task9 = executorService.submit(new Task59());
        Future<HashMap<CopyOnWriteArrayList<String>,String>> task10 = executorService.submit(new Task59());

        try {
            System.out.println(task1.get());
            System.out.println(task2.get());
            System.out.println(task3.get());
            System.out.println(task4.get());
            System.out.println(task5.get());
            System.out.println(task6.get());
            System.out.println(task7.get());
            System.out.println(task8.get());
            System.out.println(task9.get());
            System.out.println(task10.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
