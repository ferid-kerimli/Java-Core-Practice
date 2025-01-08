package week04;

public class Substring {
    public static int findIndex(String mainString, String subString) {
        int mainLength = mainString.length();
        int subLength = subString.length();

        if (subLength > mainLength) {
            return -1;
        }

        for (int i = 0; i <= mainLength - subLength; i++) {
            boolean f = true;

            for (int j = 0; j < subLength; j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    f = false;
                    break;
                }
            }

            if (f) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String mainString = "Hello";
        String subString = "Hell";

        int i = findIndex(mainString, subString);

        if (i != -1) {
            System.out.println("Substring: " + i);
        } else {
            System.out.println("Substring can not be found");
        }
    }
}
