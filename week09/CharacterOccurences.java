package week09;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class CharacterOccurences {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide string as a command line argument");
            return;
        }

        String input = args[0];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            map.put(c, i);
        }

        // Sort the map in non-desceding order
        TreeMap<Character, Integer> sortedAscending = new TreeMap<>(map);

        System.out.println("Characters in non-desdending order:");
        for (Map.Entry<Character, Integer> entry : sortedAscending.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Sort the map in non-ascending order
        TreeMap<Character, Integer> sortedDescending = new TreeMap<>(sortedAscending.descendingMap());

        System.out.println("Characters in non-ascending order:");
        for (Map.Entry<Character, Integer> entry : sortedDescending.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
