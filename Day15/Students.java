package Day15;

public class Students {
    String name;
    double cgpa;
    Students(String name,double cgpa)
    {
      this.name=name;
      this.cgpa=cgpa;
    }

    public Students() {
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
