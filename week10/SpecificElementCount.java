package week10;

import java.util.Collection;
import java.util.List;

public class SpecificElementCount {
    public static <T> int countElements(Collection<T> collection, Checker<T> checker) {
        int count = 0;
        for (T element : collection) {
            if (checker.checkProperty(element)) {
                count++;
            }
        }
        return count;
    }

    interface Checker<T> {
        boolean checkProperty(T element);
    }

    public static void testEvenIntegers() {
        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenCount = countElements(numbers, num -> num % 2 == 0);
        System.out.println("Number of even integers: " + evenCount);
    }

    public static void testPalindromeStrings() {
        Collection<String> strings = List.of("Farid", "Omar", "Rashad", "CavaC");
        int palindromeCount = countElements(strings, str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        });

        System.out.println("Number of palindrome strings: " + palindromeCount);
    }

    public static void testEmptyAccounts() {
        Collection<Account> accounts = List.of(
                new Account("Farid", 1900),
                new Account("Omar", 0),
                new Account("Rashad", 8920),
                new Account("Cavid", 5000)
        );

        int emptyAccountCount = countElements(accounts, acc -> acc.getBalance() == 0);
        System.out.println("Number of empty accounts: " + emptyAccountCount);
    }

    static class Account {
        private final String owner;
        private final int balance;

        public Account(String owner, int balance) {
            this.owner = owner;
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        testEvenIntegers();
        testPalindromeStrings();
        testEmptyAccounts();
    }
}
