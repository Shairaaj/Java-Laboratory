import java.util.*;
public class que1 {
    public static void main(String[] args) {
        Swapper swapper = new Swapper(new String[]{"Shair","Sibe","Keerthe"});
        Frequency freq = new Frequency(new Integer[]{1,2,3,3,4,5,2,4});
        swapper.start();
        freq.start();
    }
}

class Frequency extends Thread{
    Integer[] arr;
    Frequency(Integer[] arr){
        this.arr = arr;
    }
    public void run(){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i].compareTo(max) > 0) max = arr[i];
            if(arr[i].compareTo(min) < 0) min = arr[i];
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
        }
        System.out.println("The maximum value is: "+max);
        System.out.println("The minimum value is: "+min);
        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
class Swapper<T> extends Thread{
    T[] arr;
    Swapper(T[] arr){
        this.arr = arr;
    }
    public void run(){
        int i = 0, j = arr.length-1;
        while(i<j){
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
