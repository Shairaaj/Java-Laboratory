package PerAndSem1.Semester2;
public class Sem2 extends Student implements PrintHeader{
    static final int credit3 =3, credit4 = 4; 
    double sub3 , sub4;
    public Sem2(double x, double y){
        this.sub3 = x;
        this.sub4 = y;
    }
    public void printGrade(){
        System.out.printf("Subject 1:\t%f\n", this.sub3);
        System.out.printf("Subject 2:\t%f\n", this.sub4);        
        System.out.printf("CGPA:\t%f\n", calculateCGPA(sub3, sub4));
    }
    float calculateCGPA(double sub3, double sub4){
        return ((float)(sub3+sub4)/2);
    }
}