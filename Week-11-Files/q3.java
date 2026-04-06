import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q3 {
    public static void main(String[] args) {
        try{
            int ch;
            FileInputStream fis = new FileInputStream("filename.txt");
            FileOutputStream fos = new FileOutputStream("filewrite.txt",true);
            while((ch = fis.read()) != -1){
                char data = Character.toUpperCase((char)ch);
                fos.write(data);
            }
            fis.close();
            fis = new FileInputStream("filewrite.txt");
            while((ch = fis.read()) != -1){
                char data = (char) ch;
                System.out.print(data);
            }
            fis.close();
            fos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
