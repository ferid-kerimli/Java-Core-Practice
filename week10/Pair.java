package week10;

public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static <K, V> Pair<K, V> of(K key, V value) {
        return new Pair<>(key, value);
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    // Test the Pair class
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<String, Double> pair2 = new Pair<>("Two", 2.0);

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
    }
}
