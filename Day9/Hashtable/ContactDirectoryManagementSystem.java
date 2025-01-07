/*Create a program to manage a contact directory using a Hashtable in Java. Implement the following functionalities:
Add contacts with the name as the key and phone number as the value.
Search for a contact by name and display their phone number.
Remove a contact by name.
Display all contacts in the directory.*/

package Day9;

import java.util.Hashtable;
import java.util.Scanner;

public class ContactDirectoryManagementSystem {
    public static void main(String[] args) {
        Hashtable<String, String> contacts = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Contact\n2. Search Contact\n3. Remove Contact\n4. Display All Contacts\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Contact Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = sc.nextLine();
                    contacts.put(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter the name to search: ");
                    String searchName = sc.nextLine();
                    if (contacts.containsKey(searchName)) {
                        System.out.println("Search Result for " + searchName + ": " + contacts.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the name to remove: ");
                    String removeName = sc.nextLine();
                    if (contacts.containsKey(removeName)) {
                        contacts.remove(removeName);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.println("Contact Directory:");
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        contacts.forEach((key, value) -> System.out.println(key + ": " + value));
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}

