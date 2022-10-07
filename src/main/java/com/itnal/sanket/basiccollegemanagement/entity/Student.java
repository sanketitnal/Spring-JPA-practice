package com.itnal.sanket.basiccollegemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "students")
@SequenceGenerator(name = Student.STUDENT_SEQUENCE_NAME, sequenceName = Student.STUDENT_SEQUENCE_NAME)
public class Student {
    public static final String STUDENT_SEQUENCE_NAME = "STUDENT_SEQUENCE_ID";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = STUDENT_SEQUENCE_NAME)
    private Long studentId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private BigInteger phoneNumber;

    @Column(nullable = false, unique = true)
    private String emailId;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "students_courses_table", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    @ToString.Exclude
    private List<Course> optedCourses;
}
