package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.service.StudentService;
import com.example.d


@RestController
public class StudentController{
@Autowired StudentService ser;

@PostMapping("/post")
public StudentEntity sendData(@RequestBody StudentEntity stu)


}



