/*Create an abstract class Shape with an abstract method calculateArea(). 
Derive classes Circle and Rectangle and implement the calculateArea() method in both. */

package Day3;

abstract class Shape{
    public abstract void calculateArea();
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area os Circle : "+(Math.PI*radius*radius));
    }
}
class Rectangles extends Shape{
    private double length;
    private double width;
    public Rectangles(double length, double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area os Rectangle : "+(length*width));
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Shape Circle = new Circle(7.0);
        Shape Rectangles = new Rectangles(9,5);

        Circle.calculateArea();
        Rectangles.calculateArea();
    }
}
