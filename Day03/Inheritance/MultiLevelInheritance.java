/*Create a class Shape with a method area(). Derive a class Rectangle with attributes length and breadth, and override the area() method. 
Further, derive a class Square from Rectangle and demonstrate multilevel inheritance.*/

package Day3;

class shape{
    public void area(){
        System.out.println("Area of Shapes");
    }
}
class Rectangle extends shape{
    public double length;
    public double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void area() {
        System.out.println("Area of Rectangle : "+(length*breadth));
    }
}
class Square extends Rectangle{

    public Square(double length) {
        super(length, length);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Square obj1 = new Square(10);
        Rectangle obj2 = new Rectangle(10,20);
        obj1.area();
        obj2.area();
    }
}
