public class Main{
    public static void main(String[] args) {
        Shapes2D circle1 = new Circle(1,"Black", "Disk", 12);
        Shapes2D circle2 = new Circle(2,"Green", "Ball", 5);
        System.out.println("   The area is: "+circle1.getArea());
        System.out.println("   The area is: "+circle2.getArea());
        Shapes3D cuboid1 = new Cuboid(3, "Yellow", "Laptop", 2, 3, 4);
        Shapes3D cuboid2 = new Cuboid(4, "Orange","Desk", 3, 4, 5);
        System.out.println("   The volume is: "+cuboid1.getVolume());
        System.out.println("   The volume is: "+cuboid2.getVolume());
        System.out.println("The total counts are: "+Shapes.countInfo());
    }
}