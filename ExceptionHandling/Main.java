import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int num, deno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator");
        num = sc.nextInt();
        while(true){
            try{
                System.out.println("Enter the denominator");
                deno = sc.nextInt();
                System.out.println((double)(num/deno));
                System.out.println("Completed");
                break;
            }
            catch(ArithmeticException e){
                throw new ArithmeticException("Failure");
            }
        }
    }
}
