//Using the basic methods of the Object class: getClass() and toString().

package Day6;

class Persons{
    String name;
    int age;
    Persons(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Persons{name= " + name + ", age=" + age + "}";
    }
}
public class BasicMethods {
    public static void main(String[] args) {
        Persons person = new Persons("sanji",21);
        System.out.println("Class object : "+person.getClass());
        System.out.println("String : "+person.toString());
        System.out.println("Direct printing : "+person);
    }
}
