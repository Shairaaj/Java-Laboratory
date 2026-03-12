class Shapes{
    public static void main(String[] args) {
        Circle[] circles = {
            new Circle("C01", 5),
            new Circle("C02", 3),
            new Circle("C03", 7)
        };


        for(Circle c: circles){
            c.displayInfo();
        }
        System.out.println("Total 2D shapes created: "+ Shapes2D.getShapeCount());
    }
}


class Shapes2D{
    private String shapeId;
    protected double dimension1;
    private static int shapeCount;


    public Shapes2D(String id, double d1){
        this.shapeId = id;
        this.dimension1 = d1;
        shapeCount++;
    }
    public void displayInfo(){
        System.out.println("ID: "+shapeId+" dimension: "+dimension1);
    }
    public static int getShapeCount(){
        return shapeCount;
    }
}


class Circle extends Shapes2D{
    public Circle(String id, double radius){
        super(id, radius);
    }
    public double calculateArea(){
        return Math.PI * Math.pow(this.dimension1, 2);
    }


    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("Shape circle | Area: %.2f%n", calculateArea());
    }
}
