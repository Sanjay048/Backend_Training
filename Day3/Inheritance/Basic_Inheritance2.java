/*Create a class Vehicle with a method start(). Derive a class Car that overrides the start() method. 
Write a program to demonstrate method overriding.*/

package Day3;
class Vehicle{
    public void start(){
        System.out.println("Vehicle start");
    }
}
class Car extends Vehicle{
    @Override
    public void start() {
        super.start();
        System.out.println("car start");
    }
}
public class Basic_Inheritance2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
    }
}
