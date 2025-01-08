/*Create a class Utility with a static method convertToUpper(String str) that takes a string as input and returns it in uppercase. 
Test this method in the main function. */

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
