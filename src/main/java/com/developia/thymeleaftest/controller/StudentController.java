package com.developia.thymeleaftest.controller;

import com.developia.thymeleaftest.model.Student;
import com.developia.thymeleaftest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public String students(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "students";
    }

    @PostMapping("/student/create")
    public String create(@ModelAttribute Student student) {
        studentService.create(student);
        return "redirect:/students";
    }
}
