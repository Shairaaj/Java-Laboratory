public class Shapes {
    protected String color;
    protected String name;
    protected int sno;
    static int count;
    Shapes(){
        count++;
    }
    void displayInfo(){
        System.out.println(this.sno +")"+ " Shape: "+this.name+ "\n   Color: "+this.color);
    }
    static int countInfo(){
        return count;
    }
}