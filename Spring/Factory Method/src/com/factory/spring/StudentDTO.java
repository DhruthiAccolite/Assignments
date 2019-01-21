package com.factory.spring;

public class StudentDTO {
	private int rollno;
	private String name;
	private int age;
	private String standard;
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int i) {
		this.age = i;
	}
	public String toString() {
		return "Student Roll No="+rollno+" name:"+name+" age="+age+" ";
	}
}
