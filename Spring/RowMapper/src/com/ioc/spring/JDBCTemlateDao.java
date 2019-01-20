package com.ioc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("jdbcTemplateDao")
public class JDBCTemlateDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveStudent(Student student){
		String query = "insert into student(student_id,student_name) values "
				+ "("+student.getStudentid()+",'"+student.getStudentname()+"')";
		return jdbcTemplate.update(query);
	}
}