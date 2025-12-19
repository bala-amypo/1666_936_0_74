package com.example.demo.entity;

import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

public class StudentIdCard{
 @OneToOne
@JoinColumn
private StudentDetails stu;

}

