package Day2;
import  java.util.*;
public class ExitLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1,sum=0;
        while (number!=0){
            number= sc.nextInt();
            sum+=number;
        }
        System.out.println("sum : "+sum);
    }
}
