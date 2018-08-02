package com.springrest.entity;

import java.security.Timestamp;

import org.springframework.http.HttpStatus;

public class StudentNotFound {
	
	private String body;
	private int status;
	private long time;
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int notFound) {
		this.status = notFound;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	

	
}
