package week04;

import java.util.Arrays;

public class SortingStrings {
    public static String sortString(String input) {
        char[] array = input.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
    
    public static void main(String[] args) {
        String input = "zxmaqwe";
        String sortedString = sortString(input);
        System.out.println("String which is not sorted: " + input);
        System.out.println("Sorted String: " + sortedString);
    }
}
