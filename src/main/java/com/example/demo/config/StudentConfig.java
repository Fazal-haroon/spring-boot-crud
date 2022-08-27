package com.example.demo.config;

import com.example.demo.repository.StudentRepository;
import com.example.demo.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student haroon = new Student("haroon", LocalDate.of(1998, Month.AUGUST, 10), "haroon@gmail.com");
            Student mariam = new Student("mariam", LocalDate.of(2000, Month.APRIL, 07), "mariam@gmail.com");
            studentRepository.saveAll(Arrays.asList(haroon, mariam));
        };
    }
}
