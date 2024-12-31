package Day3;
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name : "+name+"\nAge : "+age);
    }
}
class Student extends Person{
    int rollNo;
    int mark;

    public Student(String name, int age, int rollNo, int mark) {
        super(name, age);
        this.rollNo = rollNo;
        this.mark = mark;
    }

    public void displayStudent(){
        super.display();
        System.out.println("Roll No : "+rollNo+"\nMark : "+mark);
    }
}
public class Basic_Inheritance1 {
    public static void main(String[] args) {
        Student st = new Student("Sanji",21,2121048,425);
        st.displayStudent();
    }
}
