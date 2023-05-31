package part11.task60;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TasksPool {
    public static void start(int numberOfThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        Future<String> task1 = executorService.submit(new Task60());
        Future<String> task2 = executorService.submit(new Task60());
        Future<String> task3 = executorService.submit(new Task60());
        Future<String> task4 = executorService.submit(new Task60());
        Future<String> task5 = executorService.submit(new Task60());
        Future<String> task6 = executorService.submit(new Task60());
        Future<String> task7 = executorService.submit(new Task60());
        Future<String> task8 = executorService.submit(new Task60());
        Future<String> task9 = executorService.submit(new Task60());
        Future<String> task10 = executorService.submit(new Task60());


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
