package com.factory.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCalling {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 
        StudentDTO highschool = (StudentDTO) context.getBean("highschool");
        System.out.println(highschool);
         
        StudentDTO primary = (StudentDTO) context.getBean("primary");
        System.out.println(primary);
    }
}
