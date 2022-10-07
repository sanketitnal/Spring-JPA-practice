package com.itnal.sanket.basiccollegemanagement.repository;

import com.itnal.sanket.basiccollegemanagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}