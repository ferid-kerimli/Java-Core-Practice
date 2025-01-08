package week07.account;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(18176, "Farid", "Male");
        Account account = new Account(1, customer, 100.0);

        try {
            account.withdraw(150.0);
        } catch (Account.InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
