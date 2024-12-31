package Day2;

public class Calculator {
    public static int add(int no1,int no2){
        return no1+no2;
    }
    public static double add(double no1,double no2){
        return no1+no2;
    }
    public static int add(int[] no){
        int sum = 0;
        for (int x: no){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Adding two integer value : "+add(30,30));
        System.out.println("Adding two double value : "+add(30.0,20.0));
        int[] nos = {1,2,3,4,5};
        System.out.println("Adding Array values : "+add(nos));
    }
}
