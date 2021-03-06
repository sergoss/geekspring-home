package com.geekbrains.controllers;

import com.geekbrains.entities.Student;
//import com.geekbrains.entities.StudentCourse;
//import com.geekbrains.repositories.StudentCoursesRepository;
import com.geekbrains.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentsController {
    private StudentsService studentsService;

//    @Autowired
//    private StudentCoursesRepository studentCoursesRepository;

    @Autowired
    public void setStudentsService(StudentsService studentsService) {
        this.studentsService = studentsService;
    }


    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    public String showStudentInfo(Model model, @PathVariable(value = "id") Long id) {
        Student student = studentsService.get(id);

        model.addAttribute("student", student);
//        List<StudentCourse> studentCourses = (List) studentCoursesRepository.findAll();
//        System.out.println(studentCourses);
//        System.out.println(studentList.get(0).getCourses());
        return "student-info";
    }

    @RequestMapping("/list")
    public String showStudentList(Model model) {
        List<Student> studentList = studentsService.getAllStudentsList();
        model.addAttribute("studentsList", studentList);

        return "students-list";
    }

    //    private StudentsService studentsService;
//
//    @Autowired
//    public void setStudentsService(StudentsService studentsService) {
//        this.studentsService = studentsService;
//    }

//    public StudentsController() {
//    }
//
//    @RequestMapping("/showForm")
//    public String showSimpleForm(Model model) {
//        Student student = new Student();
//        model.addAttribute("student", student);
//        return "student-form";
//    }
//
//    @RequestMapping("/processForm")
//    public String processForm(@ModelAttribute("student") Student student) {
//        System.out.println(student.getFirstName() + " " + student.getLastName());
//        return "student-form-result";
//    }
//
//    // http://localhost:8189/students/showStudentById?id=5
//    @RequestMapping(path="/showStudentById", method=RequestMethod.GET)
//    public String showStudentById(Model model, @RequestParam int id) {
//        Student student = studentsService.getStudentById(new Long(id));
//        model.addAttribute("student", student);
//        return "student-form-result";
//    }
//
//    @RequestMapping(path="/getStudentById", method=RequestMethod.GET)
//    @ResponseBody
//    public Student getStudentById(@RequestParam int id) {
//        Student student = studentsService.getStudentById(new Long(id));
//        return student;
//    }
//
//    @RequestMapping(path="/getStudentById/{sid}", method=RequestMethod.GET)
//    @ResponseBody
//    public Student getStudentByIdFromPath(@PathVariable("sid") int id) {
//        Student student = studentsService.getStudentById(new Long(id));
//        return student;
//    }
}
