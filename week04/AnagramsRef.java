package week04;

import java.util.Arrays;

public class AnagramsRef {
    public static boolean  isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\s", "").toLowerCase();
        s2 = s2.replaceAll("\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        // Converting string to Char, Strings are the array of char.
        char[] Arr1 = s1.toCharArray();
        char[] Arr2 = s2.toCharArray();

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        return Arrays.equals(Arr1, Arr2);
    }

    public static void main(String[] args) {
        String s1 = "kfjlsk";
        String s2 = "dksfjl";

        boolean res = isAnagram(s1, s2);

        if (res) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}
