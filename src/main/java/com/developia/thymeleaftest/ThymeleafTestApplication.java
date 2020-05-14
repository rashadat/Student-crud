package com.developia.thymeleaftest;

import com.developia.thymeleaftest.model.Student;
import com.developia.thymeleaftest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafTestApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student();
//		student.setFirstName("Taceddin");
//		student.setLastName("Taceddin");
//		student.setEmail("taceddin@gmail.com");
//		student.setPhone("32423434");

//		studentRepository.save(student);

	}
}
