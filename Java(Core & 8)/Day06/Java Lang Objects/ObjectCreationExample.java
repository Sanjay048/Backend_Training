//Creating an object of a class.

package Day6;

class Person{
   String name;
   int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void display(String name,int age){
        System.out.println("Name : "+name+"\nage : "+age);
    }
}
public class ObjectCreationExample {
    public static void main(String[] args) {
        Person.display("sanji",21);
    }
}
