//Create a program to exit a loop if the user enters the number 0 (use break).

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
