package week04;

public class ExplodedString {
    public static String explodeString(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <= i; j++) {
                stringBuilder.append(input.charAt(j));
            }
        }
        return  stringBuilder.toString();
    }

    public static void main(String[] args) {
        String input = "Baku";
        String exploded = explodeString(input);
        System.out.println("Without exploding: " + input);
        System.out.println("Exploded: " + exploded);
    }
}