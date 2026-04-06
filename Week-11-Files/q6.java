import java.io.FileInputStream;

public class q6 {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("filename.txt");
            FileInputStream fis2 = new FileInputStream("filewrite.txt");
            int ch1, ch2;
            while((ch1 = fis1.read()) != -1 && (ch2 = fis2.read())!= -1){
                if(ch1 != ch2){
                    System.out.println("Not same files!");
                    fis1.close(); fis2.close();
                    return;
                }
            }
            if(!((ch1 = fis1.read()) == -1 && (ch2 = fis2.read()) == -1)){
                System.out.println("Not same files!");
            }
            System.out.println("Same files!");
            fis1.close(); fis2.close(); return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
