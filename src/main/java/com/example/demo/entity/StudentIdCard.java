package com.example.demo.entity;

import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentIdCard{
 @OneToOne
@JoinColumn
private StudentDetails stu;

}

