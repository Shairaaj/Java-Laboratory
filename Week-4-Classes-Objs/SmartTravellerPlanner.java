import java.util.Arrays;

public class SmartTravellerPlanner{
    private String travellerName;
    private String tripDate;
    private StringBuilder destinations = new StringBuilder();
    private int[] expenses = new int[10];
    private int count = 0;
    SmartTravellerPlanner(String name, String tripDate){
        this.travellerName = name;
        this.tripDate = tripDate;
    }
    private void addDestinations(String destination){
        this.destinations.append(" "+destination);
    }
    private void addExpenses(int expense){
        this.expenses[count++] =  expense;
    }
    private void toDisplay(){
        System.out.println("Name is "+travellerName+" travels on "+tripDate+" and has destinations: "+ destinations+" expenses "+Arrays.toString(expenses));
    }
    public static void main(String[] args){
        SmartTravellerPlanner stp = new SmartTravellerPlanner("Shai", "08-APR-05");
        stp.addDestinations("Libiya");
        stp.addDestinations("Europe");
        stp.addExpenses(89);
        stp.addExpenses(78);
        stp.toDisplay();
    }
}