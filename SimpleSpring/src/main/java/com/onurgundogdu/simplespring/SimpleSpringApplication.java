package com.onurgundogdu.simplespring;

import com.onurgundogdu.simplespring.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SimpleSpringApplication {

    public static void main(String[] args) {

            SpringApplication.run(SimpleSpringApplication.class, args);
    }
    @GetMapping
    public List<Student> greetings()
    {
        return List.of(new Student(
                1L,"Onur Gündoğdu", LocalDate.of(1994, Month.JUNE,3),28
        ));
    }


}
