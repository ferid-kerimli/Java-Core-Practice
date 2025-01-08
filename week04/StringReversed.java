package week04;

public class StringReversed {
    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));
        }
        return  stringBuilder.toString();
    }
    
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Without reversing: " + input);
        System.out.println("After reversing: " + reversed);
    }
}
