/*Using Optional with Default Values
Write a program that uses Optional to provide a default value of "Guest" when no name is provided.*/

package Day17;

import java.util.Optional;
import java.util.Scanner;

public class OptionalWithDefaultValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        Optional<String> optional = Optional.ofNullable(name);
        String finalName = optional.filter(value->!value.isEmpty()).orElse("Guest");
        System.out.println("Welcome "+finalName);
    }
}
