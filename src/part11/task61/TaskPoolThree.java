package part11.task61;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskPoolThree  {

    public static void start(int numberOfThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        Future<String> task_1 = executorService.submit(new Task61());
        Future<String> task_2 = executorService.submit(new Task61());
        Future<String> task_3 = executorService.submit(new Task61());
        Future<String> task_4 = executorService.submit(new Task61());
        Future<String> task_5 = executorService.submit(new Task61());
        Future<String> task_6 = executorService.submit(new Task61());
        Future<String> task_7 = executorService.submit(new Task61());
        Future<String> task_8 = executorService.submit(new Task61());
        Future<String> task_9 = executorService.submit(new Task61());
        Future<String> task_10 = executorService.submit(new Task61());


        try {
            System.out.println(task_1.get());
            System.out.println(task_2.get());
            System.out.println(task_3.get());
            System.out.println(task_4.get());
            System.out.println(task_5.get());
            System.out.println(task_6.get());
            System.out.println(task_7.get());
            System.out.println(task_8.get());
            System.out.println(task_9.get());
            System.out.println(task_10.get());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
