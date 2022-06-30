package com.example.postgresql;

import com.example.postgresql.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlApplication.class, args);
	}


	@GetMapping
	public List<Student> hello(){
		return List.of(new Student(1L,
				"Marta",
				"marta.des@gmail.com",
				LocalDate.of(2000, Month.FEBRUARY, 8),
				21));
	}

}
