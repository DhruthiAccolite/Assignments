package com.crud.soap;


import java.util.ArrayList;


public class crud {
	private String name,company;
	private int age,id;
	
	static ArrayList<crud> emp=new ArrayList<crud>();
	public crud() {
		
	}
	
	public crud(String name,String company,int age,int id) {
		this.name=name;
		this.company=company;
		this.age=age;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return this.name+" "+this.company+" "+this.age+" "+this.id;
	}
	public String create() {

		return emp.toString();
	}
	public String read(String name,String company,int age,int id) {
		emp.add(new crud(name,company,age,id));
		return emp.toString();
	}
	public String update(String name,String company,int age,int id) {

		for(crud e:emp) {
			if(e.getId()==id) {
//				emp.remove(e);
				e.setName(name);
				e.setCompany(company);
				e.setAge(age);
				return emp.toString();
//				e.id=id;
//				emp.add(e);
			}
		}
		return "No employee found";
		
	}
	public String delete(int id) {
		for(crud e:emp) {
			if (e.id==id) {
				emp.remove(e);
				
			}
		}
		return emp.toString();
	}
	
}
