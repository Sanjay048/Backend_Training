package Day3;

interface Constants{
    double pi  = 3.14;
}
class Circles implements Constants{
    private double radius;
    public Circles(double radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println("Area of Circle : "+(pi*radius*radius));
    }
}

public class InterfaceFields {
    public static void main(String[] args) {
        Circles circle = new Circles(5);
        circle.area();
    }
}