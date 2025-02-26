package com.example.StudentCRUD.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int RollNo;
    private String Name;
    private String Department;
}
