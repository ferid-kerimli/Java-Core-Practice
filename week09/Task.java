package week09;

import java.util.PriorityQueue;

class Data implements Comparable<Data> {
    int duration;
    int priority;
    String name;

    public Data (int duration, int priority, String name) {
        this.duration = duration;
        this.priority = priority;
        this.name = name;
    }

    @Override
    public int compareTo(Data other) {

        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ", Duration: " + duration + ")";
    }
}

public class Task {
    public static void main(String[] args) {
        Data task1 = new Data(50, 3, "Task1");
        Data task2 = new Data(30, 32, "Task2");
        Data task3 = new Data(40, 37, "Task3");

        PriorityQueue<Data> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(task1);
        priorityQueue.add(task2);
        priorityQueue.add(task3);

        int availableTime = 100;
        System.out.println("Tasks that can be completed within " + availableTime + " time:");

        int totalTime = 0;

        while (!priorityQueue.isEmpty()) {
            Data currenTask = priorityQueue.poll();
            if (totalTime + currenTask.duration <= availableTime) {
                System.out.println(currenTask);
                totalTime += currenTask.duration;
            }
            else {
                break;
            }
            System.out.println("Total time spent on tasks: " + totalTime);
            System.out.println("Available time: " + availableTime);
            if (totalTime == availableTime) {
                System.out.println("Total time matches with available time");
            }
            else {
                System.out.println("Total time doesn't match with available time");
            }
        }
    }
}
