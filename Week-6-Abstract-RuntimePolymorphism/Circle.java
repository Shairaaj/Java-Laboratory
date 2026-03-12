class Circle extends Shapes2D{
    int radius;
    Circle(int sno, String color, String name, int radius){
        this.sno = sno;
        this.color = color;
        this.name = name;
        this.radius = radius;
    }
    double getArea(){
        double area = (double)(3.14 * Math.pow(radius, 2));
        this.displayInfo();
        return area;
    }
}