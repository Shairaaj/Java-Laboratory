interface BankRules {
   public static final double MIN_BALANCE = 1000;   // public static final
   void display();
}
interface LoanRules {
   public static final double INTEREST_RATE = 8.5;  // public static final
   abstract void display();
}
class Customer implements BankRules, LoanRules {
   void displayDetails() {
       System.out.println("Minimum Balance: " + MIN_BALANCE);
       System.out.println("Loan Interest Rate: " + INTEREST_RATE + "%");
   }
   public void display(){
    System.out.println("abstract1");
   }
}
public class TestApp {
   public static void main(String[] args) {
       Customer c = new Customer();
       c.displayDetails();
       // Accessing directly using interface name
       System.out.println("Access via Interface:");
       System.out.println(BankRules.MIN_BALANCE);
       System.out.println(LoanRules.INTEREST_RATE);
   }
}

