package Day18;

public class StudentList {
    String name;
    String department;
    int subject1,subject2,subject3,subject4,subject5;
    char grade;

    public StudentList(String name, String department, int subject1, int subject2, int subject3, int subject4, int subject5) {
        this.name = name;
        this.department = department;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
    }

    public char getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentList[" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", subject1=" + subject1 +
                ", subject2=" + subject2 +
                ", subject3=" + subject3 +
                ", subject4=" + subject4 +
                ", subject5=" + subject5 +
                ", grade=" + grade +
                ']';
    }

    public double calculateAverage() {
        return (subject1 + subject2 + subject3 + subject4 + subject5) / 5.0;
    }
}
