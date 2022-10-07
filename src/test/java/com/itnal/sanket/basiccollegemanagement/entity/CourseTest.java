package com.itnal.sanket.basiccollegemanagement.entity;

import com.itnal.sanket.basiccollegemanagement.repository.CourseRepository;
import com.itnal.sanket.basiccollegemanagement.repository.TeacherRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseTest {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void createCourse() {
        Teacher bruceWayne = teacherRepository.getReferenceById(1L);
        Course financeCourse = Course.builder()
                .title("Finance")
                .description("Finance related topics")
                .courseMaterialLink("https://www.financematerial.com")
                .credits(20)
                .teacher(bruceWayne)
                .build();
        courseRepository.save(financeCourse);
    }
}