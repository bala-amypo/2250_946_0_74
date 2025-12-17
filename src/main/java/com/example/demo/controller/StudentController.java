package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService ser;

    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu) {
        return ser.createData(stu);
    }

    @GetMapping("/fetchrecord")
    public List<Student> fetchRecord() {
        return ser.fetchRecord();
    }
    @GetMapping("fetchdatabycgpa{cgpa}")
    public Optional<Student> fetchDataByCgpa(@PathVariable float cgpa){
        return ser.fetchDataByCgpa(cgpa);
    }
}