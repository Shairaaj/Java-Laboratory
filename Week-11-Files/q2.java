import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int count = 0;
        try{
            Path path = Paths.get("filename.txt");
            Scanner file = new Scanner(path);
            while(file.hasNextLine()){
                String line = file.nextLine();
                for(char ch : line.toCharArray()){
                    if(isVowel(ch)){
                        count++;
                    }
                }
            }
            System.out.println("Total vowel characters: "+count);
            file.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    static boolean isVowel(char ch){
        char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        for(char chr: arr){
            if(chr == ch) return true;
        }
        return false;
    }
}
