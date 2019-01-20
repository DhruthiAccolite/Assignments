package com.ioc.spring;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetupJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Coach theCoach=applicationContext.getBean("helloWorld",Coach.class);
//		System.out.println(theCoach.returnString());
//		System.out.println(theCoach.getFortune());
//		applicationContext.close();
		
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

//		JDBCTemlateDao jdbc=(JDBCTemlateDao) applicationContext.getBean("jdbcTemplateDao");
//		Student student = new Student();
//		student.setStudentid(11);
//		student.setStudentname("accolite");
//		jdbc.saveStudent(student);
//		applicationContext.close();
		 StudentDao dao=(StudentDao)applicationContext.getBean("edao");  
		 List<Student> list=dao.getAllStudentsRowMapper();  
		 System.out.println("Row Mapper method to read data");
		 for(Student e:list)  
		    System.out.println(e.getStudentid()+" : "+e.getStudentname());  
		 List<Student> list1=dao.getAllStudents();
		 System.out.println("Result set extractor method to read data");
		 for(Student e:list1)  
			    System.out.println(e.getStudentid()+" : "+e.getStudentname());  
	}

}
