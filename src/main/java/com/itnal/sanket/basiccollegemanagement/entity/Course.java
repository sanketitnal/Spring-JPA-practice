package com.itnal.sanket.basiccollegemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "courses")
@SequenceGenerator(name = Course.COURSE_SEQUENCE_NAME, sequenceName = Course.COURSE_SEQUENCE_NAME)
public class Course {
    public static final String COURSE_SEQUENCE_NAME = "COURSE_SEQUENCE_ID";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = COURSE_SEQUENCE_NAME)
    private Long courseId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String courseMaterialLink;

    @Column(nullable = false)
    private Integer credits;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ToString.Exclude
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "optedCourses")
    private List<Student> students;
}