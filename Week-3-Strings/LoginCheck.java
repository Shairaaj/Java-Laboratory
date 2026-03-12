import java.util.*;
class LoginCheck {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"A","B","C","A"};
        Set<String> set = new HashSet<>();
        for(int i=0; i<names.length; i++){
            if(set.contains(names[i])){
                System.out.println("Duplicate string: "+names[i]);
                return;
            }
            set.add(names[i]);
        }
    }
}