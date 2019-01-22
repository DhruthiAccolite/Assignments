package com.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.test.pojo.Course;
import com.hibernate.test.pojo.Student;

public class App {

	public static void main(String[] args) {


		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Student s=new Student();
//		s.setStudentId(4);
//		s.setStudentName("ruthi");
//		s.setStudentAge(21);
//		session.save(s);
//		Course c=new Course();
//		 c.setCourseId(3);
//		 c.setCourseName("MAven");
//		 c.setStudentId(2);
//		 
//		 session.save(c);
//		 c=new Course();
//		 c.setCourseId(4);
//		 c.setCourseName("Spring");
//		 c.setStudentId(2);
//		 session.save(c);
		
		
		Criteria cr = session.createCriteria(Student.class);
		//returns empty list
		cr.add(Restrictions.eq("studentName", "dhruthi"));
		 System.out.println(cr.list());
		 
		 //returns all students
		 cr.add(Restrictions.eq("studentName", "ruthi"));
		 System.out.println(cr.list());
//		
//		 cr = session.createCriteria(Course.class);
//		
//		 cr.add(Restrictions.eq("courseName", "Hibernate"));
//		 System.out.println(cr.list());
//		System.out.println(id);
//		
//		s = new Student();
		cr = session.createCriteria(Student.class);
		
		List<Student> studentList = cr.list();
		for (Student student : studentList) {
			System.out.println(student.getStudentName() + "|" + student.getStudentAge() + "|" + student.getStudentId()
					+ "|" + (!student.getCourses().isEmpty() ? student.getCourses().get(0).getCourseName() : ""));
		}
		 session.getTransaction().commit();
	}

}
