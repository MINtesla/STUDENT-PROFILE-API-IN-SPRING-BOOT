package com.example.springlearning.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner
            (StudentRepository repository){
        return args -> {
            Student ashutosh = new Student(
                    "ashutosh",
                    "udayaashu1502@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY,15)

            );
            Student sakshi = new Student(
                    "sakshi",
                    "ohhsakshi@gmail.com",
                    LocalDate.of(2003, Month.NOVEMBER,23)

            );
            repository.saveAll(
                    List.of(ashutosh,sakshi)
            );

        };
    }
}
