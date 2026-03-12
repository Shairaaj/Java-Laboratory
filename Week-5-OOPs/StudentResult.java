import java.util.*;
class StudentResult{
    public static void main(String[] args) {
        String str = "Ravi:78,Meena:89,Kumar:56";
        String[] stu_mark_map = str.split(",");
        ArrayList<String> stuNames = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        for(int i=0; i<stu_mark_map.length; i++){
            stuNames.add(stu_mark_map[i].split(":")[0]);
            marks.add(Integer.parseInt(stu_mark_map[i].split(":")[1]));
        }
        System.out.println(stuNames);
        int sum =0, maxScorer = Integer.MIN_VALUE;
        for(int i=0; i<marks.size(); i++){
            sum+= marks.get(i);
            if(marks.get(i) > maxScorer) maxScorer = marks.get(i);
        }
        System.out.println("The average marks: "+(sum/marks.size()));
        System.out.println("The highest marks scored: "+maxScorer);
    }
}