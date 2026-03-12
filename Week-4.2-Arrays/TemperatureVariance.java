public class TemperatureVariance{
    public static void main(String[] args){
        int arr[] = {22,18,25,30};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int temp : arr){
            if(temp > max) max = temp;
            if(temp < min) min = temp;
        }
        System.out.println("Variance :"+(max-min));
    }
}