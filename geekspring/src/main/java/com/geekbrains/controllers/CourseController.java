package com.geekbrains.controllers;

import com.geekbrains.entities.Course;
import com.geekbrains.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/courses")
public class CourseController {
    private CoursesService coursesService;

    @Autowired
    public void setCoursesService(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public String showCourseInfo(Model model, @PathVariable(value = "id") Long id) {
        Course course = coursesService.get(id);

        model.addAttribute("course", course);

        return "course-info";
    }
}
