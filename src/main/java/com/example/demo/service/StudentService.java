package com.example.demo.service;

import java.util.*;
import com.example.demo.entity.Student;

public interface StudentService{

    public Student createData(Student stu);//abstract method
    public List<Student> fetchRecord();
    public Optional<Student> fetchDataById(int id);
    public void deleteData(int id);
}