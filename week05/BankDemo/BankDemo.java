package week05.BankDemo;

public class BankDemo {
    public static void main(String[] args) {
        Customer cust = new Customer(18176, "Farid", "Male");
        Account acc = new Account(20212, cust, 1000.0);

        System.out.println(acc);

        acc.deposit(1000.0);
        System.out.println("Deposit 1000.0");
        System.out.println(acc);

        acc.withdraw(2000.0);
        System.out.println("Withdraw 2000.0");
        System.out.println(acc);

        acc.withdraw(2000.0);
        System.out.println("Attempt to withdraw 30000.0");
        System.out.println(acc);
    }
}

