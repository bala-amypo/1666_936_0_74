package com.example.demo.entity;


import java.time.localDateTime;

import jakarta.validation.constraints.*;
import jakata.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
@Entity
@Data
@Getter
@Setter
@AllAgrsConstructor
@NoAgrsConstructor
public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY);
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}




