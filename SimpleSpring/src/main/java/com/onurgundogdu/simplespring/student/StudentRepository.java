package com.onurgundogdu.simplespring.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{
    @Query("SELECT s FROM Student s where s.fullname=?1")
Optional<Student> findStudentByFullname(String fullname);
}
