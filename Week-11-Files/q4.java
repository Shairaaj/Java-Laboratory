import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of bytes to print:");
        int n = sc.nextInt();
        int ch;
        int count = 0;
        try{
           FileInputStream  fis = new FileInputStream("filename.txt");
        while((ch = fis.read())!=-1){
            System.out.print((char)ch);
            count++;
            if(count == n) {
                fis.close();
                return;
            }
        }
        fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }   
    }
}
