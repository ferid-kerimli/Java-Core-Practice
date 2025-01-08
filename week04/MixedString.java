package week04;

public class MixedString {
    public static String mix(String input) {
        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 2) {
                continue;
            }

            char[] Array = words[i].toCharArray();
            char first = Array[0];
            Array[0] = Array[Array.length - 1];
            Array[Array.length - 1] = first;
            words[i] = new String(Array);
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String input = "This is PP2 Fall 2021";
        String newInput = mix(input);
        System.out.println("Before mixing: " + input);
        System.out.println("After mixing: " + newInput);
    }
}
