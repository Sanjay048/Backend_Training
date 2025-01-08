/*Create a program that uses a Set to store a collection of unique names. Implement the following features:
Add names to the set.
Check if a name is already present in the set.
Display all unique names in the set.
Input Example:
Add names: "Alice", "Bob", "Alice", "Eve", "Charlie".
Output Example:
Unique Names: [Alice, Bob, Eve, Charlie]*/

package Day10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetProblem {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add Name\n2.Check Duplicate Name\n3.Display Set\n4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter the Name : ");
                    String addName = sc.nextLine();
                    set.add(addName);
                    break;
                case 2:
                    System.out.print("Enter the Name to check Duplicate name : ");
                    String checkName = sc.nextLine();
                    if (set.contains(checkName)) System.out.println("Name is already exists in Set");
                    else System.out.println("Name not exists in Set");
                    break;
                case 3:
                    System.out.println("Name List : "+set);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice!=4);
    }
}
