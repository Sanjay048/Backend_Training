package Day2;
import  java.util.*;
public class SkippingMultiples_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i%5 == 0)
            {
                System.out.println();
                continue;
            }
            else System.out.print(i+" ");
        }
    }
}
