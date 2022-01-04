package com.onurgundogdu.simplespring.student;

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
    public List<Student> getStudents()
    {
        return List.of(new Student(
                1L,"Onur Gündoğdu", LocalDate.of(1994, Month.JUNE,3),28
        ));
    }
}
