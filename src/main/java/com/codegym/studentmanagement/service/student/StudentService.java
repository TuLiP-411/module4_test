package com.codegym.studentmanagement.service.student;

import com.codegym.studentmanagement.model.Student;
import com.codegym.studentmanagement.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void save(Student Student) {
        studentRepository.save(Student);
    }

    @Override
    public void remove(Long id) {
        studentRepository.deleteById(id);
    }


    @Override
    public Iterable<Student> findAllByName(String name) {
        return studentRepository.findAllByNameContaining(name);
    }
}

