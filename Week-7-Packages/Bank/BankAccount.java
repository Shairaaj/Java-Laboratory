package Bank;

public class BankAccount {
    private String bankHolder;
    private double balance;
    public BankAccount(){
        this.bankHolder = "";
        this.balance = 0.0d;
    }
    public double getBalance(){
        return this.balance;
    }
    public BankAccount(String name, double amount){
        this.bankHolder = name;
        this.balance = amount;
    }
    public void showAccInfo(){
        System.out.println("The account holder's name: "+bankHolder+"\n"+"The balance in the account: "+balance);
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
}
