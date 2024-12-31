package Day2;

public class Method_Overloading_Areas {
    public static double areas(double length , double width){
        return length * width;
    }
    public static double areas(double radius){
        return Math.PI * radius * radius;
    }
    public static double areas(double base , double height , boolean value){
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        System.out.println("Area of Rectangle : "+areas(5.0,20.0));
        System.out.println("Area of Circle : "+areas(15.0));
        System.out.println("Area of Triangle : "+areas(25.0,6.0 , true));
    }
}
