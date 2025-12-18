package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import java.util.List;
import java.Validation.Valid;

@RestController
public class ValidationController{
@Autowired ValidationService ser;

@PostMapping("/validpost")
public ValidationEntity postData(@Valid @RequestBody ValidationEntity stu){
return ser.postData(stu);
}
}


