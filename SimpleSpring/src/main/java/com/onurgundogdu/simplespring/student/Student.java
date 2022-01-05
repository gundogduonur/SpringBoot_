package com.onurgundogdu.simplespring.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName = "student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    private Long id;
    private String fullname;
    private LocalDate birthday;
    @Transient
    private Integer age;

    public Student()
    {

    }

    public Student(Long id, String fullname, LocalDate birthday) {
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
    }

    public Student(String fullname, LocalDate birthday) {
        this.fullname = fullname;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {

        return Period.between(this.birthday,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }
}
