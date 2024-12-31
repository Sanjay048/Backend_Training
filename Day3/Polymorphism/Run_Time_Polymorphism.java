package Day3;

class Employee{
    public void calculateSalary(){
        System.out.println("No Salary");
    }
}
class Manager extends Employee{
    @Override
    public void calculateSalary() {
        System.out.println("Manager salary : 80000");
    }
}
class Developer extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("Developer salary : 50000");
    }
}
public class Run_Time_Polymorphism {
    public static void main(String[] args) {
        Employee Manager = new Manager();
        Employee Developer = new Developer();

        Manager.calculateSalary();
        Developer.calculateSalary();
    }
}
