/*Problem Statement 1: Manage a Shopping List
Create a program that allows the user to manage a shopping list using an ArrayList. Implement the following features:
Add items to the shopping list.
Remove an item from the list.
Display the shopping list.
Input Example:
Add items: "Milk", "Eggs", "Bread", "Butter".
Remove "Eggs".
Output Example:

Shopping List: [Milk, Bread, Butter]*/

package Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemStatement1 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add Element\n2.Remove a specific Element\n3.Display List\n4.Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter the element : ");
                    String addElement = sc.nextLine();
                    arr.add(addElement);
                    break;
                case 2:
                    System.out.print("Enter the element to remove in the list : ");
                    String removeElement = sc.nextLine();
                    if(arr.contains(removeElement)) arr.remove(removeElement);
                    else System.out.println("Invalid element");
                    break;
                case 3:
                    System.out.println("List : "+arr);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (choice!=5);
    }
}
