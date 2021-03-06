package com.geekbrains.services;

import com.geekbrains.entities.Course;
import com.geekbrains.repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    private CoursesRepository coursesRepository;

    @Autowired
    public void setCoursesRepository(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    public CoursesService() {
    }

    public Course get(Long id) {
        return coursesRepository.findById(id).get();
    }
}
