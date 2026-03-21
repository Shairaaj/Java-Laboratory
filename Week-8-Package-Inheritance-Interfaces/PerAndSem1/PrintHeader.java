package PerAndSem1;
public interface PrintHeader {
    default void headPrint(){
        System.out.println("\t\tPSG College of Technology");
        System.out.println("\t\tMCA Degree Programme");
        System.out.println("\t  Mark Statement\tAcademic Year 2025-26");
    }
    void printGrade();
}