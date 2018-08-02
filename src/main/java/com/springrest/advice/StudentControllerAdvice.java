package com.springrest.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.springrest.entity.StudentNotFound;
import com.springrest.exception.StudentNotFoundException;

@ControllerAdvice
public class StudentControllerAdvice {

	@ExceptionHandler
	public ResponseEntity<StudentNotFound> handleStudentNotFoudException(StudentNotFoundException ex,WebRequest request){
		StudentNotFound stnf= new StudentNotFound();
		stnf.setBody("Student not found");
		stnf.setStatus(HttpStatus.NOT_FOUND.value());
		stnf.setTime(System.currentTimeMillis());
		
		return new ResponseEntity(stnf, HttpStatus.NOT_FOUND);
		
	}
	
	//generic exception
	@ExceptionHandler
	public ResponseEntity<StudentNotFound> handleStudentNotFoudException(Exception ex,WebRequest request){
		//error body
		StudentNotFound stnf= new StudentNotFound();
		stnf.setBody(ex.getMessage());
		stnf.setStatus(HttpStatus.BAD_REQUEST.value());
		stnf.setTime(System.currentTimeMillis());
		
		return new ResponseEntity(stnf, HttpStatus.BAD_REQUEST);
		
	}
	
}
