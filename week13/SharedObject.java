package week13;

class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getValue() {
        return count;
    }
}

class Incrementer extends Thread {
    private final Counter counter;
    private final int N;

    public Incrementer(Counter counter, int N) {
        this.counter = counter;
        this.N = N;
    }

    @Override
    public void run() {
        for (int i = 0; i < N; i++) {
            counter.increment();
        }
    }
}

class Reader extends Thread {
    private final Counter counter;
    private final int N;

    public Reader(Counter counter, int N) {
        this.counter = counter;
        this.N = N;
    }

    @Override
    public void run() {
        for (int i = 0; i < N; i++) {
            System.out.println("Value read by reader: " + counter.getValue());
        }
    }
}

public class SharedObject {
    public static void main(String[] args) {
        Counter counter = new Counter();

        int N = 1000;

        Incrementer incrementer = new Incrementer(counter, N);
        Reader reader = new Reader(counter, N);

        incrementer.start();
        reader.start();

        try {
            incrementer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counter value: " + counter.getValue());
    }
}
