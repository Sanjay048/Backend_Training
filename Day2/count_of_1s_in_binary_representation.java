package Day2;
import java.util.*;
public class count_of_1s_in_binary_representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), count=0;
        while (number>0){
            count+= number & 1;
            number=number>>1;
        }
        System.out.println("count of 1s in the binary representation : "+count);
    }
}
