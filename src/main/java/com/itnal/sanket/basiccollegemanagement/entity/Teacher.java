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
@Table(name = "teachers")
@SequenceGenerator(name = Teacher.TEACHER_SEQUENCE_NAME, sequenceName = Teacher.TEACHER_SEQUENCE_NAME)
public class Teacher {
    public static final String TEACHER_SEQUENCE_NAME = "TEACHER_SEQUENCE_ID";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = TEACHER_SEQUENCE_NAME)
    private Long teacherId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private BigInteger phoneNumber;

    @Column(nullable = false, unique = true)
    private String emailId;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher")
    private List<Course> courseList;

    @ToString.Exclude
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "teacher")
    private Billing billingDetails;
}