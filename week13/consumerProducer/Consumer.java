package week13.consumerProducer;

public class Consumer extends Thread {

    private final ShoeStore store;
    private final int consumptionCount;

    public Consumer(ShoeStore store, int consumptionCount){
        this.store = store;
        this.consumptionCount = consumptionCount;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < consumptionCount; i++){
                store.consumeShoe();
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
