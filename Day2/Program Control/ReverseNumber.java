package Day2;
import  java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(),result=0;
        while (number>0){
            int temp = number%10;
            result=result*10+temp;
            number/=10;
        }
        System.out.println("Reversed number :"+result);
    }
}
