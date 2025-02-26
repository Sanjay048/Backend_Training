//Create a class Employee with attributes id, name, and salary. Use the this keyword to resolve naming conflicts between local variables and instance variables.


package Day2;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(48, "Sanjay", 50000.0);
        emp1.displayDetails();
    }
}

