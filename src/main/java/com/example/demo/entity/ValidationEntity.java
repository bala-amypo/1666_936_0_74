package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;


@Entity
@Data
@AllArgsConstructor

public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=0,message="must be 2 to 10 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=2,max=0,message="must be 2 to 10 character")
    @NotNull(message="password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="Age is be a positive number")
    private int age;


}













