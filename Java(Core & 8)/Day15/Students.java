package Day15;

public class Students {
    String name;
    double cgpa;
    String dept;
    Students(String name,double cgpa)
    {
      this.name=name;
      this.cgpa=cgpa;
    }
    Students(String name,double cgpa,String dept)
    {
        this.name=name;
        this.cgpa=cgpa;
        this.dept=dept;
    }

    public Students() {
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return
                "[name='" + name + '\'' +
                ", cgpa=" + cgpa +"]";
    }
}
