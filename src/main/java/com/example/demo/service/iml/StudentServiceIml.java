package com.example.demo.service.iml;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

import org.springframework.stereotype.Service;


@Service
public class StudentServiceIml implements StudentService{
    @Autowired
    StudentRepository sr;

    @Override//studentservice la erukka method aah enga define panranun solradhukku
    public Student createData(Student stu){//abstract deffinition
           return sr.save(stu);
    }

    @Override
    public List<Student> fetchRecord(){
        return sr.findAll();
    }
    @Override
    public Optional<Student> fetchDataById(int id){
        return sr.findById(id);
    }

    @Override
    public void deleteData(int id){
        sr.deleteById(id);
    }
}