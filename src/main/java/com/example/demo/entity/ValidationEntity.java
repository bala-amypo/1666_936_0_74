package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
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


public void setId(Long id){
    this.id=id;
}
public String getName(){
    return name;
}
public void setName(){
    this.name=name;
}
public String getEmail(){
    return email;
}
public void setEmail(){
    this.email=email;
}
public String getPassword(){
    return password;
}
public void setPasswod(String password){
    this.password=password;
}
public String getAge(){
    return age;
}
public void setAge(String password){
    this.age=age;
}
public ValidationEntity(Long id,
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
    private int age;)

}













