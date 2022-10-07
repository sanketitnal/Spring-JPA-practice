package com.itnal.sanket.basiccollegemanagement.repository;

import com.itnal.sanket.basiccollegemanagement.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}