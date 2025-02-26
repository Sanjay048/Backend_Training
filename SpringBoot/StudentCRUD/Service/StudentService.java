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
        for (int i = 0; i < students.size() ; i++) {
            if (students.get(i).getRollNo()==rno){
                index=i;
            }
        }
        return students.get(index);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
