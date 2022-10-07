package com.itnal.sanket.basiccollegemanagement.repository;

import com.itnal.sanket.basiccollegemanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}