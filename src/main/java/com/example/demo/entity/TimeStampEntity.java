package com.example.demo.entity;


import java.time.localDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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




