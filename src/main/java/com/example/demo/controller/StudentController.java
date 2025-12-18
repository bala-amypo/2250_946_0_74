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
    @GetMapping("fetchdatabyid/{id}")
    public Optional<Student> fetchDataById(@PathVariable int id){
        return ser.fetchDataById(id);
    }
    @PutMapping("/updatedata/")
    public String updateDataById(@PathVariable int id,@RequestBody Student stu){
        Optional<Student> student=ser.fetchdata(id);
        if(student.isPresent){
            stu.setId(id);
            ser.createDate();

            return "Data is update successfully";
        }
        else{
            return id + "is not found";
            
        }

    }

}