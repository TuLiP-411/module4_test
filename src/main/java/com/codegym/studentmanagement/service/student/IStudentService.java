package com.codegym.studentmanagement.service.student;

import com.codegym.studentmanagement.model.Student;
import com.codegym.studentmanagement.service.IGeneralService;

import java.util.Optional;

public interface IStudentService extends IGeneralService<Student> {
    Iterable<Student> findAllByName(String name);
}
