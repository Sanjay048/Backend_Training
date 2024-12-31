package Day3;
import java.util.*;
public class Utility {

    public static void convertToUpper(String str){
        System.out.println("Convert to upper : "+str.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Utility.convertToUpper(str);
    }
}
