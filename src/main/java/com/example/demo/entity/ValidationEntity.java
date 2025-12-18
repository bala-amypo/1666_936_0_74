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

public Long getId(){
    return id;
}
public void setId(Long id){
    this.id=id;
}
public String getUserName(){
    return username;
}
public void setUserName(){
    this.username=username;
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
public int getAge(){
    return age;
}
public void setAge(){
    this.age=age;
}
public ValidationEntity(Long id,
    @NotNull @Size(min=2,max=0,message="must be 2 to 10 character") String username,
    @Email(message="Email is not valid") String email,
    @Size(min=2,max=0,message="must be 2 to 10 character")
    @NotNull(message="password is mandatory") String password,@Max(30)
    @Positive(message="Age is be a positive number") int age){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.age=age;
    }

}













