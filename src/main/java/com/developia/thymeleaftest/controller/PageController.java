package com.developia.thymeleaftest.controller;

import com.developia.thymeleaftest.model.Student;
import com.developia.thymeleaftest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create";
    }
}
