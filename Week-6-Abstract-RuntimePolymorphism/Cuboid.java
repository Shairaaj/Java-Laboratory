class Cuboid extends Shapes3D{
    Cuboid(int sno, String color, String name, int length, int breadth, int height){
        this.sno = sno;
        this.color = color;
        this.name = name;
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    double getVolume(){
        double volume = this.length * this.breadth * this.height;
        displayInfo();
        return volume;
    }
}