import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class q1 {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("filename.txt");
            long fileSize = Files.size(path);
            System.out.println("File Size: "+fileSize);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}