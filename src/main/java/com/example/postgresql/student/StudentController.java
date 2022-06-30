package com.example.postgresql.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){
        return List.of(new Student(1L,
                "Marta",
                "marta.des@gmail.com",
                LocalDate.of(2000, Month.FEBRUARY, 8),
                21)
        );
    }
}
