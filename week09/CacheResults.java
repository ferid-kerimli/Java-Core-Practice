package week09;

import java.util.HashMap;
import java.util.Map;

public class CacheResults {
    private static final Map<String, Result> cache = new HashMap<>();

    public static Result FindMostAndLeastFrequentChars(String input) {
        if (cache.containsKey(input)) {
            System.out.println("Cached result for input: " + input);
            return cache.get(input);
        }

        Map<Character, Integer> FrequencyMap = new HashMap<>();
        for (char a : input.toCharArray()) {
            FrequencyMap.put(a, FrequencyMap.getOrDefault(a, 0) + 1);
        }

        char MostFrequent = ' ';
        char LeastFrequent = ' ';
        int MaxFrequency = Integer.MIN_VALUE;
        int MinFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : FrequencyMap.entrySet()) {
            if (entry.getValue() > MaxFrequency) {
                MostFrequent = entry.getKey();
                MaxFrequency = entry.getValue();
            }

            if (entry.getValue() < MinFrequency) {
                LeastFrequent = entry.getKey();
                MinFrequency = entry.getValue();
            }
        }

        Result result = new Result(MostFrequent, LeastFrequent);
        cache.put(input, result);
        return result;
    }

    public static class Result {
        private final char MostFrequent;
        private final char LeastFrequent;

        public Result(char MostFrequent, char LeastFrequent) {
            this.MostFrequent = MostFrequent;
            this.LeastFrequent = LeastFrequent;
        }

        public char GetMostFrequent() {
            return MostFrequent;
        }

        public char GetLeastFrequent() {
            return LeastFrequent;
        }
    }

    public static void main(String[] args) {
        String input = "hello world";
        Result result1 = FindMostAndLeastFrequentChars(input);
        System.out.println("Most frequent character: " + result1.GetMostFrequent());
        System.out.println("Least frequent character: " + result1.GetLeastFrequent());

        Result result2 = FindMostAndLeastFrequentChars(input);
        System.out.println("Most frequent character (cached): " + result2.GetMostFrequent());
        System.out.println("Least frequent character (cached): " + result2.GetLeastFrequent());

    }
}
