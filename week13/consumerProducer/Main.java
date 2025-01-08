package week13.consumerProducer;

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        int storeCapacity = 5;
        ShoeStore store = new ShoeStore(storeCapacity);

        //Test with one consumer one producer

        Producer producer1 = new Producer(store, 10);
        Consumer consumer1 = new Consumer(store, 10);


        producer1.start();
        consumer1.start();

        producer1.join();
        consumer1.join();

        System.out.println("Final stock after one consumer and one producer " + store.getStockSize() + "\n");

        //Test with one producer and multiple consumers

        Producer producer2 = new Producer(store, 10);
        Consumer consumer2 = new Consumer(store, 5);
        Consumer consumer3 = new Consumer(store, 3);

        producer2.start();
        consumer2.start();
        consumer3.start();


        producer2.join();
        consumer2.join();
        consumer3.join();

        System.out.println("Final stock after one producer and multiple consumers " + store.getStockSize() + "\n");

        // Test with multiple producers and one consumer
        Producer producer3 = new Producer(store, 5);
        Producer producer4 = new Producer(store, 5);
        Consumer consumer4 = new Consumer(store, 10);

        producer3.start();
        producer4.start();
        consumer4.start();

        producer3.join();
        producer4.join();
        consumer4.join();

        System.out.println("Final stock after multiple producers and one consumer: " + store.getStockSize());
        

    }
}
