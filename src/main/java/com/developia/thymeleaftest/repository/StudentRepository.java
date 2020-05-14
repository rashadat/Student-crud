package com.developia.thymeleaftest.repository;

import com.developia.thymeleaftest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
