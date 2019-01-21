package com.factory.spring;

public class Student {
	public static StudentDTO createStudentofStandard(String standard)    {
        if ("highschool".equals(standard) || "primary".equals(standard))
        {
            StudentDTO student = new StudentDTO();
             
            student.setRollno(-1);
            student.setName("default");
            student.setAge(-1);
            //Set designation here
            student.setStandard(standard);
             
            return student;
        }
        else
        {
            throw new IllegalArgumentException("Unknown product");
        }
    }
}
