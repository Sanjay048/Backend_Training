/*Create a program that allows the user to manage a task list using a LinkedList. Implement the following features:
Add a task to the end of the list.
Remove a task from the list by its name.
Display all tasks in the list in the order they were added.

Input Example:
Add tasks: "Finish homework", "Go for a run", "Prepare dinner".
Remove task: "Go for a run".
Output Example:
Task List:
1. Finish homework
2. Prepare dinner
*/

package Day10;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProblem {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add Task\n2.Remove Task\n3.Display LinkedList\n4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter the task to be added : ");
                    String addTask = sc.nextLine();
                    linkedList.add(addTask);
                    break;
                case 2:
                    System.out.print("Enter the task to be removed : ");
                    String removeTask = sc.nextLine();
                    linkedList.remove(removeTask);
                    break;
                case 3:
                    System.out.println("Task List : "+linkedList);
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
