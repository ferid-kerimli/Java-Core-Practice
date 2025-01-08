package week09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class UniqueCharactersOfWord {
    private final static Map<String, List<Character>> cache = new HashMap<>();

    public static List<Character> getUniqueCharacters(String input) {
        if (cache.containsKey(input)) {
            System.out.println("Using cached result for input: " + input);
            return cache.get(input);
        }

        List<Character> uniqueCharacters = new ArrayList<>();
        boolean[] visited = new boolean[256]; // ASCII characters

        for (char a : input.toCharArray()) {
            if (!visited[a]) {
                uniqueCharacters.add(a);
                visited[a] = true;
            }
        }

        cache.put(input, uniqueCharacters);
        return uniqueCharacters;
    }

    public static void main(String[] args) {
        String input = "hello";
        List<Character> a1 = getUniqueCharacters(input);
        System.out.println("Unique characters of " + input + " : " + a1);

        List<Character> a2 = getUniqueCharacters(input);
        System.out.println("Unique characters (from cache) of " + input + " : " + a2);
    }
}
