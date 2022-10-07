package com.itnal.sanket.basiccollegemanagement.entity;

import com.itnal.sanket.basiccollegemanagement.repository.CourseRepository;
import com.itnal.sanket.basiccollegemanagement.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentTest {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void createNewStudent() {
        Course financeCourse = courseRepository.getReferenceById(1L);
        List<Course> optedCourseList = new ArrayList<Course>();
        optedCourseList.add(financeCourse);

        Student newStudent = Student.builder()
                .firstName("Sanket")
                .lastName("Itnal")
                .emailId("sanketitnal20@gmail.com")
                .phoneNumber(new BigInteger("7020306215"))
                .optedCourses(optedCourseList)
                .build();

        studentRepository.save(newStudent);
    }

    @Test
    public void getStudentById() {
        Long searchId = 2L;
        studentRepository.findById(searchId).ifPresent(student -> System.out.println(student.toString()));
    }
}