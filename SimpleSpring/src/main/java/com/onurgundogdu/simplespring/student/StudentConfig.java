package com.onurgundogdu.simplespring.student;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
            Student onur=new Student(
            "Onur Gündoğdu",
                    LocalDate.of(1994, Month.JUNE,3),
                    28
            );
            Student okan=new Student(
                    "Okan Gündoğdu",
                    LocalDate.of(1993, Month.JANUARY,30),
                    29
            );
            repository.saveAll(List.of(onur,okan));
        };
    }
}
