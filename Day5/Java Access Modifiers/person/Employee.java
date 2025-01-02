package Day5.person;

public class Employee extends Person {
    public Employee(String name, int age, String address, double salary) {
        super(name, age, address, salary);
    }
    public void diplay(){
        System.out.println("Name : " + name);
        //System.out.println("Age : " + age);
        System.out.println("Address : " + phoneNo);
        System.out.println("Salary : " + salary);
        System.out.println("Salary (get) :"+getSalary());
    }
}
