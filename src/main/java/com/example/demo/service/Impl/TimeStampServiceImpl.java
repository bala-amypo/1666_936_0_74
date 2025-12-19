package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.TimeStampService;
import com.example.demo.service.TimeStampRepo;

@Service
public class TimeStampServiceImpl implements TimeStampService{
@Autowired TimeStampRepo student; 

@Override
public TimeStampEntity post(TimeStampEntity stu){
    return student.save(stu);
}
}

