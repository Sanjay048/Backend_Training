/*Create a package shapes with two classes:
Circle with a method to calculate the area of a circle.
Rectangle with a method to calculate the area of a rectangle.
Write a Main class in the default package to import and use these classes.*/

import Day5.Shapes.Rectangle;
import Day5.Shapes.Circle;
public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5.0,6.0);
        System.out.println("Area of Rectangle : "+rec.calculateArea());

        Circle cr = new Circle(5.0);
        System.out.println("Area of Circle : "+cr.calculateArea());
    }
}
