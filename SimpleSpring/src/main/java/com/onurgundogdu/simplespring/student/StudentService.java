package com.onurgundogdu.simplespring.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents()
    {
        return List.of(new Student(
                1L,"Onur Gündoğdu", LocalDate.of(1994, Month.JUNE,3),28
        ));
    }
}