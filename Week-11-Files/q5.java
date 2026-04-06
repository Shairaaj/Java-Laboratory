import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

public class q5 {
   public static void main(String[] args) {
    try {
        Stack<Character>stack = new Stack<>();
        FileInputStream fs = new FileInputStream("filename.txt");
        int ch;
        while((ch = fs.read()) != -1){
            stack.push((char)ch);
        }
        fs.close();
        FileOutputStream fos = new FileOutputStream("filename.txt",false);
        fos.close();
        fos = new FileOutputStream("filename.txt", true);
        while(!stack.empty()){
            fos.write(stack.pop());
        }
        fos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
   } 
}
