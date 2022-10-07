package com.itnal.sanket.basiccollegemanagement.entity;

import com.itnal.sanket.basiccollegemanagement.repository.TeacherRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherTest {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void createTeacher() {
        Teacher newTeacher = Teacher.builder()
                .lastName("Wayne")
                .firstName("Bruce")
                .emailId("brucewayne@gmail.com")
                .phoneNumber(new BigInteger("8888888888"))
                .build();
        teacherRepository.save(newTeacher);
    }
}