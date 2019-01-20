package com.ioc.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao { 
private JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
  
public JdbcTemplate getTemplate() {
	return template;
}

public List<Student> getAllStudentsRowMapper(){  
 return template.query("select * from student",new RowMapper<Student>(){  
    @Override  
    public Student mapRow(ResultSet rs, int rownumber) throws SQLException {  
        Student e=new Student();  
        e.setStudentid(rs.getInt(2));  
        e.setStudentname(rs.getString(1));  
        return e;  
    }  
    });  
}
public List<Student> getAllStudents(){  
	 return template.query("select * from student",new ResultSetExtractor<List<Student>>(){  
	    @Override  
	     public List<Student> extractData(ResultSet rs) throws SQLException,  
	            DataAccessException {  
	      
	        List<Student> list=new ArrayList<Student>();  
	        while(rs.next()){  
	        Student e=new Student();  
	        e.setStudentid(rs.getInt(2));  
	        e.setStudentname(rs.getString(1));   
	        list.add(e);  
	        }  
	        return list;  
	        }  
	    });  
	  }  
}  
