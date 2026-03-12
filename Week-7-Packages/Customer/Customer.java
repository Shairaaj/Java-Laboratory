package Customer;

import Bank.BankAccount;

import java.util.Scanner;

public class Customer {
    String customerName;
    BankAccount customerAccount;
    Customer(String name, BankAccount ba){
        this.customerName = name;
        this.customerAccount = ba;
    }
    void performTransactions(double amount){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to Deposit\nEnter 2 to Withdraw");
        int type = sc.nextInt();
        if(type != 1 && type != 2){
            System.out.println("Enter valid input");
            return;
        }
        if(type == 1){
            this.customerAccount.deposit(amount);
        }
        else{
            this.customerAccount.withdraw(amount);
        }
        System.out.println("The remaining balance is: "+this.customerAccount.getBalance());
    }
}
