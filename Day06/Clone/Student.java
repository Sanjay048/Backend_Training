/*Create a class Student with fields for the name and age.
Write a program to create a clone (copy) of a Student object using the clone() method*/

package Day6;

public class Student implements Cloneable{
    String name;
    int age;
    Student(String name , int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        try {
            Student st1 = new Student("sanji", 21);
            System.out.println("Original value : "+st1);
            Student st2 = (Student) st1.clone();
            System.out.println("Cloned value : "+st2);
            System.out.println("Equal(True) or Not(False) : "+(st1==st2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
