package Day10;

import java.util.Scanner;
import java.util.Stack;

public class StackProblem {
    public static void main(String[] args) {
        Stack<String> textStack = new Stack<>();
        String text = "";
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Type a word\n2. Undo last action\n3. Display current text\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a word to type: ");
                    String word = sc.nextLine();
                    textStack.push(text);
                    text += word + " ";
                    break;
                case 2:
                    if (!textStack.isEmpty()) text = textStack.pop();
                    else System.out.println("Nothing to undo!");
                    break;
                case 3:
                    System.out.println("Current Text: \"" + text.trim() + "\"");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}

