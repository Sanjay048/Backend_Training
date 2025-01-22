/*Handling Null with Optional Write a program that accepts a String input,
converts it to uppercase if it's not null, and prints "Empty input" if the string is null.*/

package Day17;

import java.util.Optional;
import java.util.Scanner;

public class HandlingNullWithOptional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String string = sc.nextLine();
        Optional<String> optional = Optional.ofNullable(string);
        if (optional.isPresent() && !optional.get().isEmpty()) System.out.println("Upper Case : "+optional.get().toUpperCase());
        else System.out.println("Empty input");
    }
}
