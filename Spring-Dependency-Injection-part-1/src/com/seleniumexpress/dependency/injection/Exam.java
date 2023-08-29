package com.seleniumexpress.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
 
	public static void main(String[] args) {
//		Student student = new Student();
//		//student.studentName = "Sachin";
//		student.setStudentName("Sachin");
//		student.displayStudentInfo();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();
		
		Student virat = context.getBean("virat", Student.class);
		virat.displayStudentInfoConstructor();
		
		Student surya = context.getBean("surya", Student.class);
		surya.displayStudentInfoConstructor();
		
		
		
	}
	
	
	
}
