package com.springrest.exception;

public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public StudentNotFoundException(String arg0) {
		super(arg0);
	}

	public StudentNotFoundException(Throwable arg0) {
		super(arg0);
	}
	
	

}
