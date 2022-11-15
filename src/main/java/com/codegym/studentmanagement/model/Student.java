package com.codegym.studentmanagement.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Students")
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private LocalDate dob;

    private String address;
    private String phone;
    private String email;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;
}
