import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int op;
            System.out.println("Enter a choice");
            System.out.println("1 -> Find a roll no in student array!");
            System.out.println("2 -> Convert employee name with honorifics");
            System.out.println("0-> EXIT!");
            System.out.println();
            System.out.println("Enter the option: ");
            op = sc.nextInt();
            switch (op) {
                case 0:
                    sc.close();
                    return;
                case 1:
                    Student st = new Student(new String[]{"25MX221","25AB17","25DA34"});
                    st.searchRoll(sc);
                    break;
                case 2:
                    Employee emp = new Employee(new String[]{"Krishnan - Male", "Shairaaj - Male", "Gowsalya - Female", "Virginia - Female"});
                    emp.prefixer();
                    break;
                default:
                    System.out.println("Enter the correct option please!");
                    break;
            }
        }
    }
}
class Employee{
    String[] EmpNameGender;
    Employee(String[] arr){
        this.EmpNameGender = arr;
    }
    public void prefixer(){
        String gender = "";
        for(int i=0; i<EmpNameGender.length; i++){
            String part1 = EmpNameGender[i].split("-")[0];
            String part2 = EmpNameGender[i].split("-")[1];
            Pattern pattern = Pattern.compile("\\b(?:Male|Female)\\b");
            Matcher matcher = pattern.matcher(part2);
            if(matcher.find()){
                gender = matcher.group();
            }
            if("Male".equals(gender)){
                EmpNameGender[i] = "Mr."+part1;
            }
            if("Female".equals(gender)){
                EmpNameGender[i] = "Mrs."+part2;
            }
        }
        for(String st: EmpNameGender) System.out.println(st);
        System.out.println();
    }
}
class Student{
    String[] rollArr;
    Student(String[] rollArr){
        this.rollArr = rollArr;
    }
    public void searchRoll(Scanner sc){
        String search;
        System.out.println("Enter the roll no to search eg. 25ABC18: ");
        search = sc.next();
        for(String st: rollArr){
            if(st.equals(search)){
                System.out.println("Found the search roll no.");
                return;
            }
        }
        System.out.println("Search rollno. not found!");
    }
}