import Bank.BankAccount;
import Customer.Customer;

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Shairaaj V S", new BankAccount("Shairaaj", 50000.0d));
        cust.performTransactions(5000.0d);
    }
}