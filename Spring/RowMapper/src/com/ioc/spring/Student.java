package com.ioc.spring;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	int Studentid;
	String Studentname;
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	
}
