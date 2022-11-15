package com.codegym.studentmanagement.service.classroom;

import com.codegym.studentmanagement.model.Classroom;
import com.codegym.studentmanagement.repository.IClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassroomService implements IClassroomService {
    @Autowired
    private IClassroomRepository classroomRepository;

    @Override
    public Iterable<Classroom> findAll() {
        return classroomRepository.findAll();
    }

    @Override
    public Optional<Classroom> findById(Long id) {
        return classroomRepository.findById(id);
    }

    @Override
    public void save(Classroom Classroom) {
        classroomRepository.save(Classroom);
    }

    @Override
    public void remove(Long id) {
        classroomRepository.deleteById(id);
    }


}
