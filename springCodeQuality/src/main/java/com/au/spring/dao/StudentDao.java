package com.au.spring.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.au.spring.model.Student;
import com.au.spring.rowmapper.RowMapperStudent;

@Repository
public class StudentDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String getName() {
		return jdbcTemplate.queryForObject("select studentName from students where studentId=1", String.class);
	}

	public String insertStudentDetails(Student student) {
		jdbcTemplate.update("insert into students values("+student.getStudentId()+",\""+student.getStudentName()+"\");");
		return "inserted";
	}
	public List<Student> getAllStudentsRowMapper(){ 
		return jdbcTemplate.query("select * from students", new RowMapperStudent());
		}

}
