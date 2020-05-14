package com.developia.thymeleaftest.service;

import com.developia.thymeleaftest.model.Student;
import com.developia.thymeleaftest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void create(Student student) {
        if (student.getFirstName().length() > 20) {
            throw new IllegalArgumentException("too long name");
        }

        if (student.getPhone() != null && !student.getPhone().startsWith("+994")) {
            throw new IllegalArgumentException("illegal phone number");
        }

        studentRepository.save(student);
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try {
            students = studentRepository.findAll();
        } catch (Exception e) {
            System.out.println("Exception occurs in findAll: " + e.getMessage());
        }
        return students;
    }
}
