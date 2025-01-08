package week13.consumerProducer;

import java.util.ArrayList;
import java.util.List;

public class ShoeStore {

    private final List<String> stock = new ArrayList<>();
    private final int capacity;

    public ShoeStore(int capacity){
        this.capacity = capacity;
    }

    public synchronized void produceShoe() throws InterruptedException{
        while(stock.size() >= capacity){
            wait();
        }

        stock.add("Shoe");
        System.out.println("Produced a shoe. Current stock: " + stock.size());
        notifyAll();
    }

    public synchronized void consumeShoe() throws InterruptedException{
        while(stock.isEmpty()){
            wait();
        }

        stock.remove(0);
        System.out.println("Bought a shoe. Current stock: " + stock.size());
        notifyAll();
    }

    public int getStockSize(){
        return stock.size();
    }
    
}
