package Day5.Shapes;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(){
        return length*breadth;
    }
}
