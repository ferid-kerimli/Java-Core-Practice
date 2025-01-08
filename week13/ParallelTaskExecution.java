package week13;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParallelTaskExecution {
    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        try (BufferedReader br = new BufferedReader(new FileReader("tasks.csv"))) {
            ExecutorService executorService = Executors.newFixedThreadPool(NUM_THREADS);
            String line;
            while ((line = br.readLine()) != null) {
                String[] taskInfo = line.split(",");
                String taskName = taskInfo[0];
                int duration = Integer.parseInt(taskInfo[1]);

                executorService.submit(() -> {
                    System.out.println("Executing task: " + taskName);
                    try {
                        Thread.sleep(duration);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    System.out.println("Task completed: " + taskName);
                });
            }

            executorService.shutdown();
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Total time spent: " + duration + " milliseconds");
    }
}
