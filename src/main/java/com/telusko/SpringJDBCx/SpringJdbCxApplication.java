package com.telusko.SpringJDBCx;

import com.telusko.SpringJDBCx.model.Student;
import com.telusko.SpringJDBCx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCxApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbCxApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Aditya Mishra");
		s.setMarks(78);
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
