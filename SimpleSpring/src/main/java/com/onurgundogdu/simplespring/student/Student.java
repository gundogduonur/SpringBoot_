package com.onurgundogdu.simplespring.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String fullname;
    private LocalDate birthday;
    private Integer age;

    public Student()
    {

    }

    public Student(Long id, String fullname, LocalDate birthday, Integer age) {
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.age = age;
    }

    public Student(String fullname, LocalDate birthday, Integer age) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.age = age;
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
        return age;
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
