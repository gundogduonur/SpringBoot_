package com.onurgundogdu.simplespring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }

    public void addStudent(Student student)
    {
        Optional<Student> studentOptional=studentRepository.findStudentByFullname(student.getFullname());
        if(studentOptional.isPresent())
        {
            throw new IllegalStateException("Fullname token");
        }
        studentRepository.save(student);
    }
}
