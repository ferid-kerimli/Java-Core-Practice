package week13.consumerProducer;

public class Producer extends Thread {
    private final ShoeStore store;
    private final int productionCount;

    public Producer(ShoeStore store, int productionCount){
        this.store = store;
        this.productionCount = productionCount;
    }


    @Override
    public void run() {
        try {
            for(int i = 0; i < productionCount; i++){
                store.produceShoe();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
