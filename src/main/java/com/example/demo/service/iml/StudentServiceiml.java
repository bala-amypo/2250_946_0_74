package com.example.demo.service.iml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import org.springframework.sterotype.service;


@Service
public class StudentServiceiml implements StudentService{//
    @Autowired
    StudentRepository sr;

    @Override//studentservice la erukka method aah enga define panranun solradhukku
    public Student createData(@RequestBody Student stu){//abstract deffinition
           return sr.save(stu);
    }

    @Override
    public List<Student> fetchData(){
        return sr.findAll();
    }
}