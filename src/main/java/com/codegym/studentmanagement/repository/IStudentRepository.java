package com.codegym.studentmanagement.repository;

import com.codegym.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository <Student, Long> {
    Iterable<Student> findAllByNameContaining(String name);
}
