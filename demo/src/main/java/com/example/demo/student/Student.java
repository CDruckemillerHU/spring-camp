package com.example.demo.student;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName="student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;



}
