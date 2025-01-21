package Day15;

public class Students {
    String name;
    double cgpa;
    private String department;
    Students(String name,double cgpa)
    {
      this.name=name;
      this.cgpa=cgpa;
    }
    Students(String name,double cgpa,String department)
    {
        this.name=name;
        this.cgpa=cgpa;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return
                "Name = " + name + " Cgpa = " + cgpa ;
    }
}
