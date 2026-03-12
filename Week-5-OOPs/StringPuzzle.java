import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

class StringPuzzle{
    private String myString;
    private static int sno;
    StringPuzzle(){
            this.myString = new String();
            sno++;
        }
    StringPuzzle(String input){
        this.myString = input;
    }
    public static void main(String[] args) {
        StringPuzzle sp = new StringPuzzle("eat ate but tub act cat");
        System.out.println(Arrays.deepToString(sp.groupAnagram()));
    }
    
    private String[][] groupAnagram(){
        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();
        String[] words = myString.split(" ");
        for(int i=0; i<words.length; i++){
            char[] wordArr = words[i].toCharArray();
            Arrays.sort(wordArr);
            String key = new String(wordArr);
            if(!hashMap.containsKey(key)){
                hashMap.put(key, new ArrayList<>());
            }
            hashMap.get(key).add(words[i]);
        }
        Collection<ArrayList<String>> values = hashMap.values();
        System.out.println(values);
        String[][] stringArr = new String[values.size()][];
        int i = 0;
        for (ArrayList<String> list : values) {
            stringArr[i] = list.toArray(new String[0]);
            i++;
        }
        return stringArr;
    }
}