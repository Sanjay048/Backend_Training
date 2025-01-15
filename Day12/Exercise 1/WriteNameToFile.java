/*Exercise 1: Creating a File and Writing Your Name
In this exercise, you will create a new file (e.g., name.txt) and write your name to it.
Task:
Write a program that:
Creates a new text file called name.txt.
Write your name to the file.*/

package Day12;
import java.io.*;

public class WriteNameToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("name.txt");
        try (FileWriter writer = new FileWriter(file)){
            writer.write("Sanji");
        }catch (Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
