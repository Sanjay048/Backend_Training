/*Write a program that takes a sentence as input from the user and performs the following operations:
Count the number of words in the sentence.
Reverse the entire sentence.
Replace all vowels in the sentence with the character '*'.*/

package Day6;
import java.util.*;
public class StringExaple1 {
    public static void countWords(String Sentence){
        if (Sentence.length() != 0){
            String[] arr = Sentence.trim().split("\\s+");
            System.out.println("Number of words : "+arr.length);
        }
    }
    public static void reverseWords(String Sentence){
        String[] arr = Sentence.trim().split("\\s+");
        String result = "";
        for (int i = arr.length-1; i >= 0 ; i--) {
            result+=arr[i]+" ";
        }
        System.out.println("Reversed word : "+result);
    }
    public static void replaceWords(String Sentence){
        System.out.println("Replace all vowels : "+Sentence.replaceAll("[AEIOUaeiou]","*"));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String Sentence = sc.nextLine();
        countWords(Sentence);
        reverseWords(Sentence);
        replaceWords(Sentence);
    }
}
