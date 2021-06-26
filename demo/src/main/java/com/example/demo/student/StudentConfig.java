package com.example.demo.student;

import org.hibernate.boot.archive.scan.spi.ScanOptions;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student caleb = new Student(
                    "Caleb",
                    "cdruckemiller@harrisburgu.edu",
                    LocalDate.of(1995, Month.NOVEMBER, 11),
                    25
            );

            Student sophia = new Student(
                    "Sophia",
                    "sshaalan@harrisburgu.edu",
                    LocalDate.of(1995, Month.MARCH, 31),
                    26
            );

            studentRepository.saveAll(
                    List.of(caleb, sophia)
            );
        };

    }
}
