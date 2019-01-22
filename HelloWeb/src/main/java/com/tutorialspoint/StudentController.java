package com.tutorialspoint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.tutorialspoint.*;


import org.springframework.ui.ModelMap;

@Controller
public class StudentController {
	String students;
	@RequestMapping(value = "/student")
	public ModelAndView student() {
      return new ModelAndView("student", "command", new Student());
   }
//	@RequestMapping(value = "/addsStudent", method = RequestMethod.POST)
//	@ResponseBody
//	public void addStudentMVC(@ModelAttribute("student") Student student) {
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml"); 
//		JDBCTemplateDao templateDao = classPathXmlApplicationContext.getBean(jdbcTemplateDao.class);
//		templateDao.saveStudent(student);
//	}
//	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//			JDBCTemplateDao templateDao = (JDBCTemplateDao) context.getBean(JDBCTemplateDao.class);
//			int i=templateDao.saveStudent(student);
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("id", student.getId());
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JDBCTemplateDao templateDao = (JDBCTemplateDao) context.getBean(JDBCTemplateDao.class);
		templateDao.saveStudent(student);
		return "result";       
   }
	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	public ResponseEntity<String> getStudent() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao dao=(StudentDao)context.getBean("edao");  
		 List<Student> list=dao.getAllStudentsRowMapper();
		 String resp = "";
		 resp+="<h1>Row Mapper</h1><br>Name ID<br>";
			for(Student s: list) {
				resp += s + "<br>";
			}
			 List<Student> list1=dao.getAllStudents();
			 resp+="<h1>Row Mapper</h1><br>Name ID<br>";
			 for(Student s: list) {
					resp += s + "<br>";
				} 
		 
		 HttpHeaders httpHeader = new HttpHeaders();
			httpHeader.add("Content-Type", "text/plain;charset=UTF-8");

			
	return new ResponseEntity<String>(resp, HttpStatus.OK);
		       
   }
	@RequestMapping(value = "/factoryStudent", method = RequestMethod.GET)
	public ResponseEntity<String> factoryStudent() {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 String res="";
	 res+="<h1>High School Student</h1><br>";
    StudentDTO highschool = (StudentDTO) context.getBean("highschool");
    res+=highschool+"<br>";
    res+="<h1>Primary School Student</h1><br>";
    StudentDTO primary = (StudentDTO) context.getBean("primary");
    res+=primary+"<br>";
    HttpHeaders httpHeader = new HttpHeaders();
	httpHeader.add("Content-Type", "text/plain;charset=UTF-8");

	
return new ResponseEntity<String>(res, HttpStatus.OK);
	}
}