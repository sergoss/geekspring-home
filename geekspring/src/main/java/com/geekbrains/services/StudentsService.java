package com.geekbrains.services;

import com.geekbrains.entities.Student;
import com.geekbrains.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {
    private StudentsRepository studentsRepository;

    @Autowired
    public void setStudentsRepository(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public StudentsService() {
    }

    public Student get(Long id) {
        return studentsRepository.findById(id).get();
    }

    public List<Student> getAllStudentsList() {
        return (List<Student>)studentsRepository.findAll();
    }
}
