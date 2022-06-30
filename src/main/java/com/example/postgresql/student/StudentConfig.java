package com.example.postgresql.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student juancho = new Student( 1L,
                    "Juancho",
                    "juanchito@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 3)
            );

            Student petrico = new Student(
                    "petrico",
                    "petrico@gmail.com",
                    LocalDate.of(2007, Month.JANUARY, 15)
            );

            Student uribe = new Student( 3L,
                    "uribe",
                    "falsospositivos@gmail.com",
                    LocalDate.of(2004, Month.MARCH, 9)
            );

            repository.saveAll(
                    List.of(juancho, petrico, uribe)
            );
        };
    }
}
