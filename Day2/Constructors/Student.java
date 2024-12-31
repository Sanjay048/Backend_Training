//Create a class Student with attributes like name and age. Initialize these attributes using a parameterized constructor.


package Day2;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayStudentDetails(){
        System.out.println("Name : "+name+"\nAge : "+age);
    }

    public static void main(String[] args) {
        Student std1 = new Student("Sanjay",21);
        std1.displayStudentDetails();

        std1.setName("Jeeva");
        std1.setAge(22);
        std1.displayStudentDetails();
    }
}
