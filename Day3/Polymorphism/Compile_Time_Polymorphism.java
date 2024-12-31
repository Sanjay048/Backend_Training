//Create a class Calculator with overloaded methods add(int, int), add(double, double), and add(int, int, int). Test all methods.


package Day3;
class Calculator{
    public static int add(int no1 , int no2){
        return no1+no2;
    }
    public static double add(double no1 , double no2){
        return no1+no2;
    }
    public static int add(int no1 , int no2 ,int no3){
        return no1+no2+no3;
    }
}
public class Compile_Time_Polymorphism {
        public static void main(String[] args) {
            System.out.println("Sum of Double 2 nos : "+Calculator.add(5.0,20.0));
            System.out.println("Sum of Integer 2 nos : "+Calculator.add(15,20));
            System.out.println("Sum of Integer 3 nos : "+Calculator.add(15,20,30));
        }
}
