package MiniProject;

public class Student {
    int id,age;
    String name,mailId;
    char grade;

    Student(int id,String name,int age,char grade,String mailId){
        this.id=id;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.mailId=mailId;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getMailId() {return mailId;}
    public void setMailId(String mailId) {this.mailId = mailId;}
    public char getGrade() {return grade;}
    public void setGrade(char grade) {this.grade = grade;}

    @Override
    public String toString() {
        return "MiniProject.Student [ Id = "+id +", Name = "+name+", Age = "+age+", Grade = " + grade+" , MailId = "+mailId+" ]";
    }
}