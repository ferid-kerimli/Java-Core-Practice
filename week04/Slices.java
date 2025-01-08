package week04;

public class Slices {
    public static void main(String[] args) {
        String word = "SITE";
        MakeSlices(word);
    }

    public static void MakeSlices(String word) {
        for (int i = 1; i < word.length(); i++) {
            String slice = word.substring(0, i) + " " + word.substring(i);
            System.out.println(slice);
        }
    }
}
