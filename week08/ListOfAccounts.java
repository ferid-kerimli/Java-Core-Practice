package week08;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Account implements Comparable<Account> {
    private String firstname;
    private String lastname;
    private double balance;

    public Account(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account(" + "firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", balance=" + balance + ')'; 
    }

    @Override
    public int compareTo(Account other) {
        String thisFullName = this.firstname + this.lastname;
        String otherFullName = other.firstname + other.lastname;
        return thisFullName.compareTo(otherFullName);
    }

    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("Farid", "Karimli", 370));
        accountList.add(new Account("Omar", "Guluyev", 287));
        accountList.add(new Account("Rashad", "Asadli", 876));

        // Printing before sorting
        System.out.println("Before sorting");
        for  (Account a : accountList) {
            System.out.println(a);
        }

        // Sorting according to full name with comparable interface
        Collections.sort(accountList);
        System.out.println("\nSorted by full name:");
        for (Account a : accountList) {
            System.out.println(a);
        }

        // Sorting according to balance using comparator object
        Comparator<Account> balanceComparator = Comparator.comparingDouble(Account::getBalance);  
        accountList.sort(balanceComparator);
        System.out.println("\nSorted by balance:");
        for (Account a : accountList) {
            System.out.println(a);
        }     
    }

    public double getBalance() {
        return balance;
    }
}
