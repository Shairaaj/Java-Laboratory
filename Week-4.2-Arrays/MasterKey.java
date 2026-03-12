import java.util.HashMap;

class MasterKey{
    public static void main(String[] args){
        int[] codes = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0; i<codes.length; i++){
            if(hashMap.containsKey(Math.abs(target-codes[i]))){
                System.out.printf("[%d,%d]", hashMap.get(Math.abs(target-codes[i])),i);
                return;
            }   
            hashMap.put(codes[i], i);
        }
    }
}