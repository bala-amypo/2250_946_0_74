package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;

public interface StudentService{
    
    public Student createData(Student stu);
    public List<Student> fetchRecord();
}