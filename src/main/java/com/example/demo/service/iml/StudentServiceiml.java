package com.example.demo.service.iml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.

@Service
public class StudentServiceiml implements StudentService{
    @Autowired
    StudentRepo sr;

    @Override
    public Student createData(@RequestBody Student stu){
           return sr.save(stu);
    }

    @Override
    public List<Student> fetchData(){
        return sr.findAll();
    }
}