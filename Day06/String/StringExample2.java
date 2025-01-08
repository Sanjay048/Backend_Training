/*Write a program that:
Takes two strings as input from the user.
Compares them lexicographically using compareTo() method.
Checks if the two strings are equal (case-sensitive and case-insensitive).
Concatenates the two strings and prints the result.
*/

package Day6;
import java.util.*;
public class StringExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String1 : ");
        String Sentence1 = sc.nextLine();
        System.out.print("Enter the String2 : ");
        String Sentence2 = sc.nextLine();

        int result = Sentence1.compareTo(Sentence2);
        if (result>0) System.out.println("The string1 is lexicographically > string2");
        else if (result<0) System.out.println("The string1 is lexicographically < string2");
        else System.out.println("The string1 is lexicographically = string2");

        if(Sentence1.equals(Sentence2)) System.out.println("Two string are equal (Case-Sensitive)");
        else System.out.println("Two strings are not equal (Case-Sensitive)");
        if(Sentence1.equalsIgnoreCase(Sentence2)) System.out.println("Two string are equal (Case-Insensitive)");
        else System.out.println("Two strings are not equal (Case-Insensitive)");

        System.out.println("Concatenate two String : "+Sentence1+Sentence2);
    }
}
