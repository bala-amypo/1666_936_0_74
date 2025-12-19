package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeStampServiceImpl implements StudentService{
@Autowired StudentRepo student; 

@Override
public StudentEntity postData(StudentEntity stu){
    return student.save(stu);
}
}

