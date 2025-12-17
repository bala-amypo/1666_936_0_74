package com.example.demo.entity

import java.sql.Date;

@Entity
public class StudentEntity(){
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
public
public String getPassword(){
    return password;
}
public void setPasswod(){
    this.password=password;
}

}