package week08;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctWords {
    public static void main(String[] args) {
        String[] names = {"Farid", "Rashad", "Omar", "Farid"};

        List<String> distinctNames = new ArrayList<>();
        Set<String> checkedNames = new LinkedHashSet<>();

        for (String name : names) {
            if (checkedNames.add(name)) {
                distinctNames.add(name);
            }
        }

        System.out.println("Distinct names with original order:");
        System.out.println(distinctNames);

        // Ordering Alphabetically
        List<String> sortedNames = distinctNames.stream().sorted().collect(Collectors.toList());

        System.out.println("\nDistinct words in alphabetical order:");
        System.out.println(sortedNames);
    }
}
