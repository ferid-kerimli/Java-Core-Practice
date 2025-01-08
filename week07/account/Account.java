package week07.account;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this(id, customer, 0.0);
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            throw new InvalidAmountException("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    // Custom runtime exception class
    public static class InvalidAmountException extends RuntimeException {
        public InvalidAmountException(String message) {
            super(message);
        }
    }
}
