package com.springrest.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.springrest.entity.Student;
import com.springrest.entity.StudentNotFound;
import com.springrest.exception.StudentNotFoundException;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	List<Student> student;
	
	@PostConstruct
	public void studentData(){
		System.out.println("inside post construct");
		student=new ArrayList();
		student.add(new Student("hemkar","kumar"));
		student.add(new Student("sudhakar","jha"));
		student.add(new Student("saif","badar"));
		student.add(new Student("rohit","cyril"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return student;
		
	}
	
	//define end point for single student by id
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId){
		
		if(studentId>student.size()){
			throw new StudentNotFoundException("Student not found "+studentId);
		}
		return student.get(studentId);
		
	}

}
