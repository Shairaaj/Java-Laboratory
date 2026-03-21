package PerAndSem1;
public class Sem1 extends Student implements PrintHeader{
    static final int credit1 = 2, credit2 = 4;
    double sub1, sub2;
    public Sem1(double sub1, double sub2){
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
    public void printGrade(){
        System.out.printf("Subject 1:\t%f\n", this.sub1);
        System.out.printf("Subject 2:\t%f\n", this.sub2);        
        System.out.printf("CGPA:\t%f\n", calculateCGPA(sub1, sub2));
    }
    float calculateCGPA(double sub1, double sub2){
        return ((float)(sub1+sub2)/2);
    }
}