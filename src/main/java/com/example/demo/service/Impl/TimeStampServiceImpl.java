package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.TimeStampService;
import com.example.demo.repository.TimeStampRepo;
import com.example.demo.entity.TimeStampEntity;

@Service
public class TimeStampServiceImpl implements TimeStampService{
@Autowired TimeStampRepo student; 

@Override
public TimeStampEntity postData(TimeStampEntity stu){
    return student.save(stu);
}
}

