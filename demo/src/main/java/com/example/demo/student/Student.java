package com.example.demo.student;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;



}
