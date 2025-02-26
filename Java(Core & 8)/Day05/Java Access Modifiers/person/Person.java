package Day5.person;

public class Person {
    public String name;
    private int age;
    String phoneNo;
    protected double salary;

    public Person(String name, int age, String phoneNo, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
