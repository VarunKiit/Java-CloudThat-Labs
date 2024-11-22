package com.cloudthat.StudentService;

import com.cloudthat.StudentService.model.Student;
import com.cloudthat.StudentService.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentServiceApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollno(101);
		s.setName("Varun");
		s.setMarks(89);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students = service.getStudent();
		System.out.println(students);

	}

}
