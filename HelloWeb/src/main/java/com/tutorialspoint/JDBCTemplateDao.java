package com.tutorialspoint;




import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.stereotype.Component;

	
	
	public class JDBCTemplateDao {
		
		DataSource dataSource ;
		private JdbcTemplate jdbcTemplate;
		
		public String saveStudent(Student student){
			this.jdbcTemplate=new JdbcTemplate( dataSource);
			String query = "insert into students(studentId,studentName) values "
					+ "("+student.getId()+",'"+student.getName()+"')";
			System.out.println(query);
			jdbcTemplate.update(query);
			return  "hello";
			
		}

		public DataSource getDataSource() {
			return dataSource;
		}

		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
		}
		
	}

