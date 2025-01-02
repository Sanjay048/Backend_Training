/*Create a class Person with:
name (public)
age (protected)
address (default)
salary (private)
Create a subclass Employee in the same package to demonstrate which members are accessible.
Create another class TestAccess in a different package to test accessibility.
*/

package Day5.testaccess;

import Day5.person.Person;

public class TestAccess {
    public static void main(String[] args) {
        Person person = new Person("Sanji", 21, "9342954600", 50000.0);
        System.out.println("Name: " + person.name);
        //System.out.println("Age: " + person.age);
        //System.out.println("Address: " + person.phoneNo);
        //System.out.println("Salary: " + person.salary);
        System.out.println("Salary (get) :"+ person.getSalary());

    }
}