package com.example.StudentCRUD.Service;

import com.example.StudentCRUD.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Sanji","IT"),
                    new Student(2,"Sanjay","CSE")
            )
    );
    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentByRno(int rno) {

        int index = 0;
        boolean found = false;
        for (int i = 0; i < students.size() ; i++) {
            if (students.get(i).getRollNo()==rno){
                index=i;
                found=true;
                break;
            }
        }
        if (found) return students.get(index);
        else return new Student(0,"","");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String  updateStudent(Student student) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < students.size() ; i++) {
            if (students.get(i).getRollNo()==student.getRollNo()){
                index=i;
                found=true;
                break;
            }
        }
        if(!found) return "No such element exists";
        else {
            students.set(index , student);
            return "Updated Student";
        }
    }

    public String deleteStudent(int rno) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < students.size() ; i++) {
            if (students.get(i).getRollNo()==rno){
                index=i;
                found=true;
                break;
            }
        }
        if(found) {
            students.remove(index);
            return "Deleted Successfully";        }
        else {
            return "No such element exists";
        }
    }
}
