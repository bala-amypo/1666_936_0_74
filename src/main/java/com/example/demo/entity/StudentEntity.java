package com.example.demo.entity



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class StudentEntity(){

    @Id
    @GeneratedValue(strategy=GenertationTy)

    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;

public Date getCreated(){
    return created;
}
public void setCreated(Date created){
    this.created=created;
}
public void setId(Integer id){
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

public SampleEntity(Integer id,String name,String email,String password,Date created){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password=password;
    this.created=created;
}
public SampleEntity(){

}

}