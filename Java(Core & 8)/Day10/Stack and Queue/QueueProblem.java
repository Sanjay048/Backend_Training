/*Create a program that uses a Queue to manage a Customer Support System. The program should:
Add customers to the queue as they arrive.
Serve customers in the order they arrived (FIFO - First In, First Out).
Display the list of waiting customers.*/

package Day10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueProblem {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Customer\n2. Serve Customer\n3. Display Waiting Customers\n4. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name : ");
                    String customerName = sc.nextLine();
                    queue.add(customerName);
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        String servedCustomer = queue.poll();
                        System.out.println("Served customer : "+servedCustomer);
                    }
                    else System.out.println("No customers in the queue");
                    break;
                case 3:
                    if (!queue.isEmpty()) System.out.println("Waiting Customers : "+queue);
                    else System.out.println("No customers are waiting");
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
    }
}

